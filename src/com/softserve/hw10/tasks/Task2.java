package com.softserve.hw10.tasks;

import com.softserve.IO.Input;
import com.softserve.IO.Output;

public class Task2 {

    public static void rubSecondTask(){

        //Enter a sentence that contains the words between more than one space. Convert all spaces, consecutive, one.
        // For example, if we introduce the sentence "I    am      learning     Java   Core»,
        // we have to get the "I'm learning Java Core»

            Output.print(Input.inputString("Please, enter your sentence: ").replaceAll("\\s{2,}", " "));

    }

}
