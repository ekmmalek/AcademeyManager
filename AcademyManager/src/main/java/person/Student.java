package person;

import java.time.Year;

public final class Student extends Person {

    private boolean activeStudent;

    public Student(String name, Year initialYear) {
        super(name, initialYear);
    }

    public void setActiveStudent() {
        this.activeStudent = true;
    }

    public boolean isActiveStudent() {
        return activeStudent;
    }

}
