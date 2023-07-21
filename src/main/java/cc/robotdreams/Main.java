package cc.robotdreams;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Just for test */

        Scanner sc = new Scanner(System.in);
        StudentsGroup studentsGroup = new StudentsGroup();
        studentsGroup.addStudent(sc);
        studentsGroup.addStudent(sc);
        studentsGroup.addStudent(sc);
        System.out.println(studentsGroup.studentsGroup.get(0).getId());
        System.out.println(studentsGroup.studentsGroup.get(1).getId());
        System.out.println(studentsGroup.studentsGroup.get(2).getId());
        System.out.println("Старостою групи є: " + studentsGroup.headStudent.firstName + " " + studentsGroup.headStudent.lastName);
        studentsGroup.addHomeWork("Вивчити інкапсуляцію");
        studentsGroup.addHomeWork("Вивчити наслідування");
        studentsGroup.addHomeWork("Вивчити поліморфізм");
        studentsGroup.changeHeadStudent(studentsGroup.studentsGroup.get(1));
        System.out.println("Новим старостою групи є: " + studentsGroup.headStudent.firstName + " " + studentsGroup.headStudent.lastName);
        studentsGroup.markHomeWorkAsCompleted(studentsGroup.studentsGroup.get(0), "Вивчити інкапсуляцію");
        studentsGroup.markHomeWorkAsCompleted(studentsGroup.studentsGroup.get(0), "Вивчити java");
        for (String completedHomeWork : studentsGroup.studentsGroup.get(0).getCompletedHomeWork())
            System.out.println(completedHomeWork);
    }
}