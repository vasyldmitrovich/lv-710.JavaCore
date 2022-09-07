package com.softserve.hw05.Tasks;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;

import java.util.Arrays;

public class Task3 {
    public static void run() {
        System.out.println("Enter 5 integer numbers:");
        In myIn = new Input();
        int[] numbers = new int[5];
        int secondPositive = 0, minInt = Integer.MAX_VALUE, minPos = 0, product = 0, secondPositivePos = -1;
        for (int i = 0; i < 5; i++) {
            numbers[i] = myIn.readInt();
            if (numbers[i] > 0) {
                secondPositive++;
                if (secondPositive == 2)
                    secondPositivePos = i;
            }
            if (numbers[i] < minInt) {
                minInt = numbers[i];
                minPos = i;
            }
            if ((i + 1) % 2 == 0) product += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        if (secondPositivePos > 0) System.out.println("Position of second positive number is " + (secondPositivePos+1));
        else System.out.println("Positive numbers less than 2");
        System.out.println("The minimum is " + numbers[minPos] + " with position " + (minPos + 1));
        System.out.println("Product of all entered even numbers is " + product);
    }
}

