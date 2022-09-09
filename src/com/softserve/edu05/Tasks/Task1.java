package com.softserve.edu05.Tasks;

import java.util.Random;

public class Task1 {

    public static void run() {
        int[] arr = new int[10];
        int biggest = Integer.MIN_VALUE, sum = 0, amountPositive = 0, amountNegative = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt();
            if (arr[i] > biggest) biggest = arr[i];
            if (arr[i] > 0) {
                sum += arr[i];
                amountPositive++;
            } else amountNegative++;
            System.out.println(arr[i]);
        }
        System.out.println("\n The biggest of these numbers is " + biggest);
        System.out.println("The sum of positive numbers in the array is " + sum);
        System.out.println("The amount of negative numbers in the array is " + amountNegative);
        if (amountPositive > amountNegative) System.out.println("Positive values are more then negative");
        else if (amountPositive < amountNegative) System.out.println("Negative values are more then positive");
        else System.out.println("The amount of positive and negative is the same");
    }
}
