package com.softserve.hw09.tasks;

import com.softserve.IO.Output;
import com.softserve.hw09.tasks.classes.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task3 {

    static public void runTask3() {


        //Write class Student that provides information about the name of the student and his course.
        // Class Student should consist of:
        //  -properties for access to these fields
        //  -constructor with parameters
        //  -method printStudents (List students, Integer course),
        //   which receives a list of students and the course number and prints to the console the names of the students
        //   from the list, which are taught in this course (use an iterator)
        //  -methods to compare students by name and by course
        //  -In the main() method
        //      -declare List students and add to the list five different students
        //      -display the list of students ordered by name
        //      -display the list of students ordered by course.

        List<Student> students = new ArrayList<>();

        students.add(new Student("Orest", 1));
        students.add(new Student("Andrii", 2));
        students.add(new Student("Maksym", 1));
        students.add(new Student("Stepan", 2));
        students.add(new Student("Oksana", 3));

        Student.printStudents(students, 2);

        Comparator<Student> comparatorByName = Comparator.comparing(Student -> Student.getName());
        students.sort(comparatorByName);

        Output.print("\nStudent sorted by name: \n\n" + students);

        Comparator<Student> comparatorByCourseID = Comparator.comparing(Student -> Student.getCourseID());
        students.sort(comparatorByCourseID);

        Output.print("\nStudent sorted by course ID: \n\n" + students);

    }

}
