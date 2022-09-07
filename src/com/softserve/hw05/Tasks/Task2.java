package com.softserve.hw05.Tasks;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;

public class Task2 {
    public static void run() {
        System.out.println("Enter 10 integer numbers:");
        boolean allPositive = true;
        int[] numbers = new int[10];
        In myIn = new Input();
        for (int i = 0; i < 10; i++) {
            numbers[i] = myIn.readInt("");
            if (i < 5) allPositive = allPositive && numbers[i] > 0;
        }
        if (allPositive) {
            int temp = 0;
            System.out.print("First 5 numbers are positive, their summ = ");
            for (int i = 0; i < 5; i++) temp += numbers[i];
            System.out.println(temp);
        } else {
            int temp = 1;
            System.out.print("First 5 numbers aren't positive, hence the product of the last numbers = ");
            for (int i = 5; i < 10; i++) temp *= numbers[i];
            System.out.println(temp);
        }
    }
}
