package com.softserve.edu10.tasks;

import com.softserve.IO.Input;
import com.softserve.IO.Output;

public class Task1 {

    public static void runFirstTask(){

        // Enter the two variables of type String. Determine whether the first variable substring second.\
        // For example, if you typed «IT» and «IT Academy» you must receive true.

        String firstString = Input.inputString("Enter the two variables of type String. \n" +
                "Please input first variable of type String.");
        String secondString = Input.inputString("Please input first variable of type String.");

        if (secondString.contains(" " + firstString + " "))
            System.out.println("\"" + firstString + "\"" + " is substring of " + "\"" + secondString + "\"");
        else
            System.out.println("\"" + firstString + "\"" + " isn't substring of " + "\"" + secondString + "\"");

    }



}
