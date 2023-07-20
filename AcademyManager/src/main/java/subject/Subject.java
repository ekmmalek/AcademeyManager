package subject;

import exception.StudentNotFoundException;
import lombok.Data;
import lombok.ToString;
import person.Employee;
import person.Person;
import person.Student;
import test.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Year;
import java.util.*;

@Data
public class Subject {

    private int ID;
    private String name;
    private Year session;
    private Employee lecturer;
    private ArrayList<Test> tests;
    @ToString.Exclude
    private ArrayList<Student> students;
    private Map<Student, Map<Integer, Test>> marks;

    public Subject(int ID, String name, Year session, Employee lecturer){

        this.ID = ID;
        this.name = name;
        this.session = session;
        this.lecturer = lecturer;
        this.students = new ArrayList<>();
        this.marks = new HashMap<>();
    }

    //add one student
    public void addStudent(Student student) {
        this.students.add(student);
    }

    //add many students
    public void addStudents(List<Student> students){
        this.students.addAll(students);
    }

    //remove students by studentId
    public void removeStudent(int studentId){
        this.students.removeIf(student -> student.getID() == studentId);
    }

    //change lecturer
    public void changeLecturer(Employee lecturer){
        this.lecturer = lecturer;
    }

    //add mark
    public void addMark(int studentId, int mark, int testId) throws StudentNotFoundException {
        Student student = students.stream().filter(s -> s.getID() == studentId).findFirst().orElse(null);
        Test test = tests.stream().filter(t -> t.getID() == testId).findFirst().orElse(null);
        if (student != null || test != null) {
            Map map = new HashMap();
            map.put(mark,test);
            marks.put(student,map);
        } else {
            throw new StudentNotFoundException(studentId);
        }
    }

    //delete mark
}
