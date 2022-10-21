package com.softserve.edu11.Tasks;

import com.softserve.edu15.IO.In;
import com.softserve.edu15.IO.Input;

public class Task1 {
    public static void run(){
        In myIn = new Input();
        int a=myIn.readInt("Enter a: ");
        int b=myIn.readInt("Enter b: ");
        try {
            System.out.println("Area of a rectangle: "+squareRectangle(a,b));
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    private static int squareRectangle (int a, int b){
        if(a<0 | b<0){
            throw new NumberFormatException("Negative value");
        }
        else return a*b;
    }
}
