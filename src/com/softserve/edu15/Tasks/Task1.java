package com.softserve.edu15.Tasks;

import com.softserve.edu15.IO.In;
import com.softserve.edu15.IO.Input;

import java.util.Arrays;

public class Task1 {
    public static void run() {
        In myIn = new Input();
        int num = myIn.readInt("Enter number to generate Fibonacci sequence: ");
        int[] digits = new int[num];
        if (num > 0) digits[0] = 1;
        if (num > 1) digits[1] = 1;
        if (num > 2) for (int i = 2; i < num; i++) {
            digits[i] = digits[i - 1] + digits[i - 2];
        }
        System.out.print("Fibonacci sequence: ");
        System.out.println(Arrays.toString(digits));
    }
}
