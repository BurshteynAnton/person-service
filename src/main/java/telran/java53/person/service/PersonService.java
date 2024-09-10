package telran.java53.person.service;

import telran.java53.person.dto.*;

import java.util.List;

public interface PersonService {
    Boolean addPerson(PersonDto personDto);

    PersonDto findPersonById(Integer id);

    PersonDto removePerson(Integer id);

    PersonDto updatePersonName(Integer id, String name);

    PersonDto updatePersonAddress(Integer id, AddressDto addressDto);

    PersonDto[] findPersonsByCity(String city);

    PersonDto[] findPersonsByName(String name);

    PersonDto[] findPersonsBetweenAge(Integer minAge, Integer maxAge);

    Iterable<CityPopulationDto> getCitiesPopulation();

    Iterable<ChildDto> getAllChildren();


    List<EmployeeDto> findEmployeesBySalary(int min, int max);
}