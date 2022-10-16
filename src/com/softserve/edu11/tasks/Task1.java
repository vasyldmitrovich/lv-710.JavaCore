package com.softserve.edu11.tasks;

import com.softserve.IO.Input;
import com.softserve.IO.Output;
import com.softserve.edu11.tasks.calsses.NegativeValueExeption;

public class Task1 {

    public static void runFirstTask(){
        while (true){
            try {
                Output.print(squareRectangle(
                    setLengthOfRectangleSide(Input.inputInt("Please, enter lhe length of the first side" +
                                    " of the rectangle",
                            "You need to enter integer, 3 or 18 for example")),
                    setLengthOfRectangleSide(Input.inputInt("Please, enter lhe length of the second side" +
                                    " of the rectangle",
                            "You need to enter integer, 3 or 18 for example"))));
                break;
            } catch (NegativeValueExeption e) {
                Output.print("The length of a side of a rectangle cannot be negative, try again");
            }
        }

    }

    private static int squareRectangle(int a, int b){
        return a*b;
    }

    private static int setLengthOfRectangleSide(int n) throws NegativeValueExeption{
        if (n < 0) throw new NegativeValueExeption();
        return n;
    }

}
