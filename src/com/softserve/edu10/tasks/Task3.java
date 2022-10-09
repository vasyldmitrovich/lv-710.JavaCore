package com.softserve.edu10.tasks;

import com.softserve.IO.Output;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void runThirdTask(){

        //The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
        // Using regular expressions implement checking the user name for validity.
        // Input five names in the main method . Output a message to the console of the validation
        // of each of the entered names.

        String[] usernames = {"Ihor@LoL", "Ihor_Lol", "Ігор_Лол", "Ihor_1o1", "Ihor_101_1234567890"};
        Pattern pattern = Pattern.compile("[A-z0-9_]{3,15}");
        for (String template : usernames){
        Matcher matcher = pattern.matcher(template);
        Output.print("Username: " + "\"" + template + "\"" + ((matcher.matches()) ? " is correct" : " is incorrect"));
        }

    }

}
