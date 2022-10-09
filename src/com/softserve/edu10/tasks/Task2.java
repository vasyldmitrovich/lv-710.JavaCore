package com.softserve.edu10.tasks;

import com.softserve.IO.Input;
import com.softserve.IO.Output;

public class Task2 {

    public static void runSecondTask(){

        //Enter surname, name and patronymic on the console as a variable of type String.

        String surname = Input.inputString("Please, enter your surname",
                "Surname can be 2 to 15 letters", 2, 15);
        String name = Input.inputString("Please, enter your name",
                "Name can be 2 to 15 letters", 2, 15);
        String middleName = Input.inputString("Please, enter your middle name",
                "Middle name can be 2 to 15 letters", 2, 15);

        // Output on the console: surnames and initials

        Output.print(surname + " " + toInitials(name) + toInitials(middleName));

        // name

        Output.print(name);

        // name, middle name and last name

        Output.print(String.join(" ", surname, name, middleName));
    }

    private static String toInitials(String word){
        if (word.startsWith("Y"))
            return word.substring(0, 2) + ".";
        return word.substring(0, 1) + ".";
    }

}
