package com.softserve.hw05.Tasks;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;

public class Task1 {
    public static void run(){
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        In myIn = new Input();
        int month = myIn.readInt("Enter the number of month: ");
        System.out.println("This month has "+daysInMonth[month-1]+" days");
    }
}
