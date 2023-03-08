package com.softserve.edu04.hm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// READY !!
public class IntNumbers {
    public static void runMyApp() throws IOException {
        checkIntNumbers(inputNumbers());
    }

    public static void checkIntNumbers(int[] intArray) throws IOException {
        int max = intArray[0];
        int min = intArray[0];
        int imax = -1;
        int imin = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                imax = i;
                max = intArray[i];
            }
            if (min > intArray[i]) {
                imin = i;
                min = intArray[i];
            }
        }
        System.out.println("Max number = " + max);
        System.out.println("Min number = " + min);
    }

    public static int[] inputNumbers() throws IOException {
        System.out.println("Print three integer numbers");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[]{
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())};
        System.out.println("numbers = " + Arrays.toString(numbers));
        return numbers;
    }

    public static void main(String[] args) throws IOException {
        runMyApp();
    }
}
