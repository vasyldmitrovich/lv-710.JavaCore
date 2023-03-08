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
        Integer[] integers = new Integer[]{Integer.parseInt(showMessageAndReturnInputData("Enter whole number")),
                Integer.parseInt(showMessageAndReturnInputData("Enter whole number")),
                Integer.parseInt(showMessageAndReturnInputData("Enter whole number"))};
        int count = 0;
        for (Integer number :
                integers) {
            if (number % 2 != 0) {
                System.out.println(number + " - is an odd number");
                count++;
            }
        }
        System.out.println("of all odd numbers: " + count);
    }

    public static String showMessageAndReturnInputData(String s) {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }
}
