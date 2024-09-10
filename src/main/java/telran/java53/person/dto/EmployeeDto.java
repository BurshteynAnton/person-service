package telran.java53.person.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import telran.java53.person.model.Address;

import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
public class EmployeeDto extends PersonDto{
    String company;
    Integer salary;

    public EmployeeDto(Integer id, String name, LocalDate birthDate, Address address, String company, int salary) {
        super();
    }
}
