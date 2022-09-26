package com.softserve.hw08.tasks;

import com.softserve.IO.Output;
import com.softserve.hw08.tasks.classes.firstTaskClasses.FullName;
import com.softserve.hw08.tasks.classes.firstTaskClasses.Student;

public class Task1 {

    public static void runFirstTask(){

        Student[] students = new Student[] {
                new Student(new FullName("Jack", "Russel"), 19, 200002),
                new Student(new FullName("Bull", "Dog"), 21, 200001),
        };

        for (Student template : students){
            Output.print(template.info());
        }

    }

}
