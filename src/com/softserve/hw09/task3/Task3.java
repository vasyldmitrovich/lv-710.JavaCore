package com.softserve.hw09.task3;

import java.util.Collections;

/**
 * Write class Student that provides information about the name of the student and his course. Class Student should
 * consist of
 * <p>a) properties for access to these fields
 * <p>b) constructor with parameters
 * <p>c) method printStudents (List students, Integer course), which receives a list of students and the course number
 * and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
 * <p>d) methods to compare students by name and by course
 * <p>e) In the main() method:
 * <p> - declare List students and add to the list five different students
 * <p> - display the list of students ordered by name
 * <p> - display the list of students ordered by course.
 */
public class Task3 {
    public void run() {
        Student student1 = new Student("Alla", 3);
        Student student2 = new Student("Ira", 2);
        Student student3 = new Student("Igor", 3);
        Student student4 = new Student("Serhii", 2);
        Student student5 = new Student("Roman", 1);

        Collections.sort(Student.getStudents());
        System.out.println(Student.getStudents());

        Student.getStudents().sort(Student.compareByCourse());
        System.out.println(Student.getStudents());


    }
}
