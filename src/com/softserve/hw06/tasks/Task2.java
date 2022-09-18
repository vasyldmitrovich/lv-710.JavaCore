package com.softserve.hw06.tasks;

import com.softserve.IO.Output;
import com.softserve.hw06.tasks.classes.secondTaskClasses.Developer;
import com.softserve.hw06.tasks.classes.secondTaskClasses.Employee;

public class Task2 {

    public static void runSecondTask() {

        Developer developer = new Developer("Yurii", 26, "Java Developer", 1000.0);
        Output.print(developer.report());

    }

}
