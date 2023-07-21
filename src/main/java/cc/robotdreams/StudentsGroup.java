package cc.robotdreams;

import java.util.*;

public class StudentsGroup {

    private Student headStudent;
    private final List<Student> students = new ArrayList<>();
    private final List<String> homeWork = new ArrayList<>();
    private final Map<String, Set<Student>> completedHomeWork = new HashMap<>();

    public StudentsGroup(Student headStudent) {
        this.headStudent = headStudent;
        students.add(headStudent);
    }

    public void changeHeadStudent(Student newHeadStudent) {
        headStudent = newHeadStudent;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(Student student) {
        if (!student.equals(headStudent)) {
            students.remove(student);
        }
    }

    public void addHomeWork(String homeWork) {
        this.homeWork.add(homeWork);
    }

    public void markHomeWorkAsCompleted(Student student, String completedHomeWork) {
        if (homeWork.contains(completedHomeWork)) {
            Set<Student> existing = this.completedHomeWork.getOrDefault(completedHomeWork, new HashSet<>());
            existing.add(student);
            this.completedHomeWork.put(completedHomeWork, existing);
        }
    }

    public Student getHeadStudent() {
        return headStudent;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getHomeWork() {
        return homeWork;
    }
}
