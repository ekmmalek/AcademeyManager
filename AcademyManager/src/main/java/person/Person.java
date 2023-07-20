package person;

import lombok.Data;

import java.time.Year;

@Data
public class Person {

    private int ID;
    private String name;
    private Year initialYear;
    private Year endYear;

    public Person(String name, Year initialYear){
        this.ID = PersonIDGenerator.generateId();
        this.name = name;
        this.initialYear = initialYear;
        this.endYear = null;
    }

}
