package com.softserve.hw10.Tasks;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;

public class Task2 {
    public static void run() {
        In myIn = new Input();
        String sentence = myIn.readString("Enter sentence of five words: ").replaceAll(" +"," ");
        System.out.println(sentence);
    }
}
