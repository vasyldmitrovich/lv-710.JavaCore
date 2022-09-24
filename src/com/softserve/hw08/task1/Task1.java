package com.softserve.hw08.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * @1 Develop a FullName class with the firstName and lastName fields of type String, which would correspond
 * to the principle of encapsulation.
 * @2 Create an abstract Person class with fullName field of type FullName and age of type int.
 * @3 In the Person class, create a constructor
 * public Person(FullName fullName, int age)
 * and a method called info(), which will return a string in the format
 * "First name: <firstName>, Last name: <lastName>, Age: <age>"
 * and an abstract public activity() method with a String return type.
 * @4 Develop a Student class with an int field that matches the course the student is taking.
 * @5 In the Student class, create a constructor with parameters to initialize all fields in the class, and
 * override the info() method (which would also add course information to the previous line),
 * and the activity() method from the Person class. The activity() method should return a string
 * value that is the type of activity for the corresponding Person subtype, for example for a student - this
 * could be the value "I study at university".
 * @6 In the main(...) method, create two instances of the Student class and output information about
 * them by calling the appropriate methods info() and activity().
 */
public class Task1 {
    public void run() {
        var students = new ArrayList<Student>(){{
            add(new Student(new FullName("Harry", "Blunder"), 22, 5));
            add(new Student(new FullName("Tony", "Godfrey"), 20, 3));
        }};

        students.forEach(student -> {
            System.out.println(student.info());
            System.out.println(student.activity());
        });
    }
}
