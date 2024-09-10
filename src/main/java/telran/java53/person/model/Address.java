package telran.java53.person.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@Embeddable
public class Address implements Serializable {

    private static final long serialVersionUID = -1878968599874987245L;
    String city;
    String street;
    Integer building;
}
