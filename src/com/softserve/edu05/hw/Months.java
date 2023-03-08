package com.softserve.edu05.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// READY!!
public class Months {
    public static void createMonthsAndPrintDesiredMonth() throws IOException {
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        checkDesiredMonth(months);
    }

    public static void checkDesiredMonth(int[] array) throws IOException {
        int m = printDesiredMonth();
        for (int i = 0; i < array.length; ) {
            if (m == i + 1) {
                System.out.println(array[i] + " days this month");
            }
            if (m > array.length) {
                System.out.println("Error. The month with this number does not exist");
                System.exit(0);
            }
            i++;
        }
    }

    public static Integer printDesiredMonth() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfMonth = Integer.parseInt(br.readLine());
        return numberOfMonth;
    }

    public static void main(String[] args) throws IOException {
        createMonthsAndPrintDesiredMonth();
    }
}
