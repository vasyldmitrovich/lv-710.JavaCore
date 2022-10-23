package com.softserve.hw09collections;

import com.softserve.hw09collections.task1.CollectionOperations;
import com.softserve.hw09collections.task2.FirstLastName;
import com.softserve.hw09collections.task3.Student;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {

        Set<Integer> set = new HashSet<>() {{
            add(1);
            add(3);
            add(5);
            add(7);
        }};

        Set<Integer> set2 = new HashSet<>() {{
            add(1);
            add(7);
            add(9);
            add(11);
        }};

        System.out.println("Union of sets: " + new CollectionOperations().union(set, set2));
        System.out.println("Intersection of sets: " + new CollectionOperations().intersect(set, set2));
    }

    public static void task2() {

        Map<String, String> personMap = new HashMap<>() {{
            put("Zelensky", "Volodymyr");
            put("Mazepa", "Ivan");
            put("Hrushevskyi", "Mykhailo");
            put("Khmelnytskyi", "Boghdan");
            put("Shevchenko", "Taras");
            put("Johnson", "Borys");
            put("Thatcher", "Margaret");
            put("Churchill", "Winston");
            put("Kent", "Clark");
            put("Gabble", "Winston");
        }};

        new FirstLastName().deleteSpecificPerson(personMap, "Clark");
    }

    public static void task3() {
        List<Student> studentList = new ArrayList<>() {{
            add(new Student("Mark Zuckerberg", 121));
            add(new Student("Steve Jobs", 131));
            add(new Student("Davy Johns", 141));
            add(new Student("Bill Gates", 121));
            add(new Student("Marco Polo", 131));

        }};

        new Student().printStudents(studentList, 121);
        System.out.println(" ");

        studentList.stream().sorted().forEach(System.out::println);
        System.out.println(" ");

        studentList.stream().sorted(Student.compareByCourse()).forEach(System.out::println);
    }
}
