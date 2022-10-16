package com.softserve.hw11.tasks;

import com.softserve.IO.Output;
import com.softserve.hw11.tasks.classes.Number;

import java.util.Random;

public class Task2 {

    public static void runSecondTask(){

        Random r = new Random();

        try {
            for (int i = 0; i < 10; i++){
            Output.print(new Number(r.nextInt((150 - 1) + 1)).readNumber(1,100));
            }
        } catch (NumberFormatException e){
            Output.print("Invalid number");
        }



    }

}
