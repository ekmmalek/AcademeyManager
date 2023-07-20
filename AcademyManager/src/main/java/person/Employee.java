package person;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Year;


public class Employee extends Person {

    private String position;
    private double salary;

    public Employee(String name, Year initialYear) {
        super(name, initialYear);
    }

}
