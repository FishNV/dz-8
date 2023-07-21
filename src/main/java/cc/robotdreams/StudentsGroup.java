package cc.robotdreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsGroup {

    public Student headStudent;
    public List<Student> studentsGroup = new ArrayList<>();
    HomeWork homeWork = new HomeWork();

    Scanner sc = new Scanner(System.in);

    public void changeHeadStudent(Student newHeadStudent) {
        headStudent = newHeadStudent;
    }

    public void addStudent(Scanner sc) {
        System.out.println("Будь ласка, введіть імʼя студенда");
        String firstname = sc.nextLine();
        System.out.println("Будь ласка, введіть прізвище студенда");
        String lastname = sc.nextLine();
        Student student = new Student(firstname, lastname, studentsGroup.size()+1);
        studentsGroup.add(student);
        if (studentsGroup.size() == 1) {
            headStudent = student;
        }

    }

    public void deleteStudent(Student student) {
        studentsGroup.remove(student);
        if (headStudent == student && !studentsGroup.isEmpty()) {
            headStudent = studentsGroup.get(0);
        }
        if (studentsGroup.isEmpty()) {
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

}
