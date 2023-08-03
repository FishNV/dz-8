package cc.robotdreams;

import java.util.*;

public class StudentsGroup {

    private Student headStudent;
    private final List<Student> students = new ArrayList<>();
    private final List<String> homeWork = new ArrayList<>();
    private final Map<String, Set<Student>> completedHomeWork = new HashMap<>();

    public StudentsGroup(Student headStudent) {
        if (headStudent == null) {
            throw new IllegalArgumentException("Група не може існувати без старости");
        }
        this.headStudent = headStudent;
        students.add(headStudent);
    }

    public void changeHeadStudent(Student newHeadStudent) {
        if (newHeadStudent == null) {
            System.err.println("Такого студента не існує, будь ласка, спробуйте ще раз");
            return;
        }
        if (!students.contains(newHeadStudent)) {
            System.err.println("Цей студент не в групі, неможливо зробити його старостою");
            return;
        }
        headStudent = newHeadStudent;
    }

    public void addStudent(Student student) {
        if (student == null) {
            System.err.println("Такого студента не існує, будь ласка, спробуйте ще раз");
            return;
        }
        students.add(student);
    }

    public void deleteStudent(Student student) {
        if (student == null || !students.contains(student)) {
            System.err.println("Такого студента немає в групі");
            return;
        }
        if (student.equals(headStudent)) {
            System.err.println("Не можливо видалити старосту, спочатку зробіть старостою іншого студента");
            return;
        }
        students.remove(student);
    }

    public void addHomeWork(String homeWork) {
        if (homeWork == null) {
            System.err.println("Неможливо добавити домашнє завдання без опису");
            return;
        }
        if (this.homeWork.contains(homeWork)) {
            System.err.println("Таке домашнє завдання вже існує");
            return;
        }
        this.homeWork.add(homeWork);
    }

    public void markHomeWorkAsCompleted(Student student, String completedHomeWork) {
        if (student == null || !students.contains(student)) {
            System.err.println("Такого студента немає в групі");
            return;
        }
        if (completedHomeWork == null || !homeWork.contains(completedHomeWork)) {
            System.err.println("Такого домашнього завдання не задавали");
            return;
        }
        Set<Student> existing = this.completedHomeWork.getOrDefault(completedHomeWork, new HashSet<>());
        existing.add(student);
        this.completedHomeWork.put(completedHomeWork, existing);
    }


    public String getHeadStudent() {
        return "Староста групи - " + headStudent.getFirstName() + " " + headStudent.getLastName();
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getHomeWork() {
        return homeWork;
    }
}
