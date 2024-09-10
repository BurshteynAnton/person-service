package telran.java53.person.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
@Entity(name = "Citizen")
@Table(name = "persons")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person implements Serializable {

    private static long serialVersionUID = -4597186503610053592L;
    @Id
    Integer id;
    @Setter
    String name;
    LocalDate birthDate;
    @Setter
//    @Embedded
    Address address;
}
