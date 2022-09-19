package com.softserve.edu15.Tasks;

import com.softserve.edu15.IO.In;
import com.softserve.edu15.IO.Input;

public class Task3 {
    public static void run() {
        In myIn = new Input();
        double costOfDollar = myIn.readDouble("Enter cost of dollar: ");
        double sumOfMoneyInGryvna = myIn.readDouble("Enter sum of money in gryvna:");
        System.out.println("P.S. I did not understand the task");
        System.out.println("User can buy " + (int) (sumOfMoneyInGryvna / costOfDollar) + " dollars");
    }
}
