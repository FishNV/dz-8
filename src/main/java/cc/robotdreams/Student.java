package cc.robotdreams;

public class Student {

    private final int id;
    private final String firstName;
    private final String lastName;

    public Student (int id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
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
