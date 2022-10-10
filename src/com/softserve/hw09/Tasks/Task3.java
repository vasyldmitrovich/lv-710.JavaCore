package com.softserve.hw09.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void run() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kolya",1));
        students.add(new Student("Vasya",1));
        students.add(new Student("Petya",2));
        students.add(new Student("Oksana",3));
        students.add(new Student("Zina",4));
        students.sort((o1, o2) -> o2.compareByName(o1, o2));
        System.out.println(students);
        students.sort((o1, o2) -> o2.compareByCourse(o1, o2));
        System.out.println(students);
    }
}
