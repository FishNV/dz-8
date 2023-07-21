package cc.robotdreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsGroup {

    private Student headStudent;
    private final List<Student> students = new ArrayList<>();
    private final HomeWork homeWork = new HomeWork();

    public void changeHeadStudent(Student newHeadStudent) {
        headStudent = newHeadStudent;
    }

    public void addStudent(Scanner sc) {
        System.out.println("Будь ласка, введіть імʼя студенда");
        String firstname = sc.nextLine();
        System.out.println("Будь ласка, введіть прізвище студенда");
        String lastname = sc.nextLine();
        Student student = new Student(firstname, lastname, students.size()+1);
        students.add(student);
        if (students.size() == 1) {
            headStudent = student;
        }
    }

    public void deleteStudent(Student student) {
        students.remove(student);
        if (headStudent == student && !students.isEmpty()) {
            headStudent = students.get(0);
        }
        if (students.isEmpty()) {
            headStudent = null;
        }
    }

    public void addHomeWork(String homeWork) {
        this.homeWork.addHomeWork(homeWork);
    }

    public void markHomeWorkAsCompleted(Student student, String completedHomeWork) {
        for (String homeWork : homeWork.getHomeWork()) {
            if (homeWork.equalsIgnoreCase(completedHomeWork)) {
                student.addCompletedHomeWork(completedHomeWork);
            }
        }
    }

    public Student getHeadStudent() {
        return headStudent;
    }

    public List<Student> getStudents() {
        return students;
    }

    public HomeWork getHomeWork() {
        return homeWork;
    }
}
