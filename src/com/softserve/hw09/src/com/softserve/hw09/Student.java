package com.softserve.hw09;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {
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

    public void printStudents(List<Student> students, int course){

        Iterator<Student> studentIterator = students.iterator();

        while (studentIterator.hasNext()){
            Student  st = studentIterator.next();
            if (st.getCourse()==course){
                System.out.println("Students on this course: " + st.name);
            }
        }
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public static class compareByName implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getName().compareTo(student2.getName());

        }
    }

    public static class compareByCourse implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getCourse() - (student2.getCourse());

        }
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Course: " + course + "\n";
    }
}

