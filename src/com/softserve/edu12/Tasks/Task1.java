package com.softserve.edu12.Tasks;

import static com.softserve.edu12.Tasks.PrintThread.printTextWithInterval;

public class Task1 {
    public static void run(){
        printTextWithInterval("I study Java",10,1000).start();
    }

}
