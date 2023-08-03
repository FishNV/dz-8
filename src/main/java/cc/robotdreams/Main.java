package cc.robotdreams;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Андрій", "Рибак");
        Student student2 = new Student("Катерина", "Костенко");
        Student student3 = new Student("Дмитро", "Вишневий");
        Student student4 = new Student("Марко", "Вовчок");
        Student student5 = new Student("Ганна", "Кириленко");

        StudentsGroup studentsGroup = new StudentsGroup(student1);
//        StudentsGroup studentsGroup2 = new StudentsGroup(null);      // Error is returned

        studentsGroup.addStudent(student2);
        studentsGroup.addStudent(student3);
        studentsGroup.addStudent(student5);
        studentsGroup.changeHeadStudent(student2);
        studentsGroup.changeHeadStudent(null);
        studentsGroup.changeHeadStudent(student4);
        System.out.println(studentsGroup.getHeadStudent());

        System.out.println();

        System.out.println("Група ключає таких студентів");
        for (Student student : studentsGroup.getStudents()){
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }

        System.out.println();

        studentsGroup.addHomeWork("Вивчити інкапсуляцію");
        studentsGroup.addHomeWork(null);
        studentsGroup.addHomeWork("Вивчити наслідування");
        studentsGroup.addHomeWork("Вивчити поліморфізм");
        studentsGroup.addHomeWork("Вивчити абстракцію");

        System.out.println();

        System.out.println("У групи є такі домашні завдання: " + studentsGroup.getHomeWork());

        System.out.println();

        studentsGroup.markHomeWorkAsCompleted(student1, "Вивчити інкапсуляцію");
        studentsGroup.markHomeWorkAsCompleted(student1, null);
        studentsGroup.markHomeWorkAsCompleted(student4, "Вивчити інкапсуляцію");

        System.out.println();

        studentsGroup.deleteStudent(student2);
        studentsGroup.deleteStudent(student4);
        studentsGroup.deleteStudent(student1);

        System.out.println();

        System.out.println("Група ключає таких студентів");
        for (Student student : studentsGroup.getStudents()){
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }

    }
}
