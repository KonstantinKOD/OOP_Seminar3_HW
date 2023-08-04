package ru.Ryabov.OOP.seminar3HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;
    private String numGroup;

    public StudentGroup() {
        students = new ArrayList<>();
        this.numGroup = numGroup;
    }

    public StudentGroup(List<Student> students) {
        setStudents(students);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        if (students != null) {
            students.add(student);
        }
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }
}
