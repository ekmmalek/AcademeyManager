package subject;

public class SubjectIDGenerator {
    private static int id;
    public static int generateId(){
        incrementID();
        return id;
    }
    private static void incrementID(){
        id++;
    }
}
