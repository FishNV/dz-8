package cc.robotdreams;

public class Student {

    private final int id;
    private static int nextID = 0;
    private final String firstName;
    private final String lastName;

    public Student (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++nextID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId () {
        return this.id;
    }
}
