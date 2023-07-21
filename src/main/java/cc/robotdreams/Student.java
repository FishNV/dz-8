package cc.robotdreams;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public final String firstName;
    public final String lastName;
    public final int id;
    private final List<String> completedHomeWork = new ArrayList<>();

    public Student (String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public int getId () {
        return this.id;
    }

    public void addCompletedHomeWork(String completedHomeWork) {
        this.completedHomeWork.add(completedHomeWork);
    }

    public List<String> getCompletedHomeWork() {
        return this.completedHomeWork;
    }
}
