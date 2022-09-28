package com.softserve.hw09.task3;

import java.util.*;

public class Student implements Comparable<Student> {
    private static final List<Student> students = new ArrayList<>();
    private String name;
    private int course;

    public Student() {
        students.add(this);
    }

    public Student(String name, int course) {
        this();
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static List<Student> getStudents() {
        return students;
    }

    public void printStudents (List<Student> students, Integer course) {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student currentStudent = studentIterator.next();
            if (currentStudent.getCourse() == course) {
                System.out.println(currentStudent.getName());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

    public static Comparator<Student> compareByCourse() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse() - o2.getCourse();
            }
        };
    }
}
