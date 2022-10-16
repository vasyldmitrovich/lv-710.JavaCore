package com.softserve.hw11.tasks;

import com.softserve.IO.Input;
import com.softserve.IO.Output;

public class Task1 {

    public static void runFirstTask(){

        while (true){

            try {
            Output.print(String.format("%.3f", div(Input.inputDouble("Pleas, enter the dividend",
                    "Incorrect input, you need" + "to enter a number, 3 or 3,5"),
                    Input.inputDouble("Pleas, enter the divisor",
                    "Incorrect input, you need" + "to enter a number, 3 or 3,5"))));
            break;
            }catch (Exception e) {
                Output.print("Error, try again");
            }

        }

    }

    private static double div(double dividend, double divisor) throws Exception{
        return dividend/divisor;
    }

}
