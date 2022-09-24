package com.softserve.edu07.practical_tasks.task2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create next structure. In abstract class Person with property name, declare abstract method print().
 * In other classes in body of method print() output text “I am a …”. In class Staff declare abstract
 * method salary(). In each concrete class create constant TYPE_PERSON. Output type of person
 * in each constructor.
 * Create array of Person and add some Teachers, Cleaners and Students to it.
 * Call method print() for all of it. Call method salary() for all Teachers and Cleaner
 */
public class Task2 {
    public void run() {
        Person[] people = {
                new Student("student1"),
                new Student("student2"),
                new Student("student3"),
                new Student("student4"),
                new Cleaner("cleaner1"),
                new Cleaner("cleaner2"),
                new Cleaner("cleaner3"),
                new Teacher("teacher1"),
                new Teacher("teacher2")
        };

        Arrays.stream(people)
                .forEach(Person::print);

        Arrays.stream(people)
                .filter(person -> person instanceof Staff)
                .map(person -> (Staff) person)
                .forEach(Staff::salary);

    }
}
