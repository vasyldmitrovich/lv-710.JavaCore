package com.softserve.hw10.tasks;

import com.softserve.IO.Input;
import com.softserve.IO.Output;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void runThirdTask(){

        //Implement a pattern for US currency: the first symbol "$", then any number of digits,
        // dot and two digits after the dot. Enter the text from the console that contains several
        // occurrences of US currency. Display all occurrences on the screen.

        Pattern p = Pattern.compile("[$]\\d+?[.,]\\d{0,2}");
        String sentence = Input.inputString("Please enter your text");
        Matcher m = p.matcher(sentence);
        while (m.find()){
            Output.print(sentence.substring(m.start(), m.end()));
        }

    }

}
