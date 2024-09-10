package telran.java53.person.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Child")
public class Child extends Person{

    private static final long serialVersionUID = -7913933273446549843L;
    String kindergarten;

    public Child(Integer id, String name, LocalDate birthDate, Address address, String kindergarten) {
        super(id, name, birthDate, address);
        this.kindergarten = kindergarten;
    }
}
