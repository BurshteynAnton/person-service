package telran.java53.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import telran.java53.person.dto.CityPopulationDto;
import telran.java53.person.model.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    @Query("select p from Citizen p where upper(p.name)=upper(?1)")
    Stream<Person> findByNameIgnoreCase(String name);

    @Query("select p from Citizen p where upper(p.address.city)=upper(:cityName)")
    Stream<Person> findByAddressCityIgnoreCase(@Param("cityName") String city);

    Stream<Person> findByBirthDateBetween(LocalDate from, LocalDate to);

    @Query("select new telran.java53.person.dto.CityPopulationDto(p.address.city, count(p)) from Citizen p group by p.address.city order by count(p) desc")
    List<CityPopulationDto> getCityPopulation();
}
