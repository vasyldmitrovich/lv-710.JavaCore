package com.softserve.edu04.practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// READY !!
public class OddNumber {
    public static void main(String[] args) throws IOException {
        checkMyNumber();
    }

    public static void checkMyNumber() throws IOException {
        System.out.println("Enter three whole numbers");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.valueOf(br.readLine());
        int number2 = Integer.valueOf(br.readLine());
        int number3 = Integer.valueOf(br.readLine());

        Integer[] integers = new Integer[]{number1, number2, number3};
        for (Integer number :
                integers) {
            if (number % 2 != 0) {
                System.out.println("this number is odd: " + number);

            }
        }
    }
}
