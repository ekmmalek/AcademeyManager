package utils;

import lombok.experimental.UtilityClass;
import person.Person;
import person.Student;

import java.time.Year;

@UtilityClass
public class StudentHelper {

    public static boolean isStudent(Person person) {
        return person.getClass().equals(Student.class);
    }

    public static boolean isStudentInitialYear(Year year, Person person) {
        return year.equals(person.getInitialYear());
    }

    public static boolean isActiveStudent(Person person) {
        return isStudent(person) && ((Student) person).isActiveStudent();
    }

    public static boolean isStudentFromInitialYear(Year year, Person person) {
        return isActiveStudent(person) && isStudentInitialYear(year, person);
    }

}
