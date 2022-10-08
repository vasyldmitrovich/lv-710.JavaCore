package com.softserve.hw08.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        task1();
    }

    public static void task1() {
        List<Student> students = new ArrayList<Student>() {{
            add(new Student("John", "Kross", 31, 121));
            add(new Student("Max", "Lewis", 28, 120));
        }};

        students.forEach(student -> {
            System.out.println(student.info());
            System.out.println(student.activity());
        });
    }
}
