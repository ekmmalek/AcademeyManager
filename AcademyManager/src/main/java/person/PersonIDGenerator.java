package person;

public class PersonIDGenerator {
    private static int id;
    public static int generateId(){
        incrementID();
        return id;
    }
    private static void incrementID(){
        id++;
    }
}
