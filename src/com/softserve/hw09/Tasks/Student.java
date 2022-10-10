package com.softserve.hw09.Tasks;

import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
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
    public static void printStudents(List<Student> students, int course){
        for (Student student: students) {
            if (student.getCourse()==course) System.out.println(student);
        }
    }
    public int compareByName(Student st1, Student st2){
        return st1.getName().compareTo(st2.getName());
    }
    public int compareByCourse(Student st1, Student st2){
        return st1.getCourse()- st2.getCourse();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
