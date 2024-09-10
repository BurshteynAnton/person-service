package telran.java53.person.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Employee extends Person{
    private static final long serialVersionUID = 4241846600580135495L;
    String company;
    int salary;

    public Employee(Integer id, String name, LocalDate birthDate, Address address, String company, int salary) {
        super(id, name, birthDate, address);
        this.company = company;
        this.salary = salary;
    }
}
