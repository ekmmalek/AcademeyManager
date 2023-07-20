import person.Employee;
import person.Person;
import person.PersonIDGenerator;
import person.Student;
import subject.Subject;
import subject.SubjectIDGenerator;

import java.time.Year;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Jack", Year.of(2020));
        Student student2 = new Student("Mark", Year.of(2012));
        Student student3 = new Student("Tom", Year.of(2025));
        Student student4 = new Student("Tom", Year.of(2035));

        Employee professor1 = new Employee("Josef", Year.of(2010));

        Subject kombinatoryka =  new Subject(SubjectIDGenerator.generateId(),"Kombinatoryka", Year.of(2023), professor1);

        Academy academy = new Academy("Politechnika Gdańska");
        academy.addSubjects(kombinatoryka);
        academy.addPerson(professor1);
        academy.addPerson(student1);
        academy.addPerson(student2);
        academy.addPerson(student3);
        academy.addPerson(student4);


        AcademyManager academyManager = new AcademyManager(academy);

        System.out.println(academyManager.getAllSubjectsFromSession(Year.of(2023)));
        System.out.println(academyManager.getAllStudentsFromSession(Year.of(2020)));
        System.out.println(academyManager.getAllStudentsFromSubject(1));
    }

}
