package com.softserve.hw08.tasks;

import com.softserve.IO.Output;
import com.softserve.hw08.tasks.classes.secondTaskClasses.Wrapper;

public class Task2 {

    public static void runSecondTask(){

        Wrapper<Object>[] wrappers = new Wrapper[] {
                new Wrapper<String>("Hello World"),
                new Wrapper<Integer>(101),
                new Wrapper<Boolean>(true)
        };

        for (Wrapper<Object> template : wrappers){
            System.out.println(template.getValue());
        }
    }
}
