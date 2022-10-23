package com.softserve.hw09collections.task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {

    private String studentName;
    private Integer courseNumber;

    public Student() {
    }

    public Student(String studentName, Integer courseNumber) {
        this.studentName = studentName;
        this.courseNumber = courseNumber;
    }

    public void printStudents(List<Student> students, Integer courseNumber) {
        Iterator<Student> studentIterator = students.iterator();
        if (studentIterator.hasNext()) {
            for (Student student : students) {
                if (student.getCourseNumber().equals(courseNumber)) {
                    System.out.println(
                            "Student name: " + student.getStudentName() + ", " +
                                    "Course: " + student.getCourseNumber()
                    );
                }
            }
        }
    }

    public String getStudentName() {
        return this.studentName;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    @Override
    public int compareTo(Student student) {
        return this.getStudentName().compareTo(student.getStudentName());
    }

    public static Comparator<Student> compareByCourse() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student student, Student student2) {
                return student.getCourseNumber() - student2.getCourseNumber();
            }
        };
    }

    @Override
    public String toString(){
        return String.format("Student name: %s, course number: %d", studentName, courseNumber);
    }
}
