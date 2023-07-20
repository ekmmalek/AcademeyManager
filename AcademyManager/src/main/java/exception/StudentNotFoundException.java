package exception;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(int studentId) {
        super("Błąd: Student o identyfikatorze " + studentId + " nie został znaleziony.");
    }
}
