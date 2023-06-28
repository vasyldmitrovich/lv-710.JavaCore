package com.softserve.edu05Array.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// READY!!
public class Numbers10 {
    public static void inputAndCheckNumbers() throws IOException {
        checkNumbers(inputNumbers());
    }

    public static void checkNumbers(int[] array) {
        int sum = 0;
        int prod = 1;
        boolean b = true;
        int i;

        for (i = 0; i < array.length / 2; i++) {
            if (array[i] < 0) {
                b = false;
            }
        }
        if (b == true) {
            for (i = 0; i < array.length / 2; i++) {
                sum = sum + array[i];
            }
            System.out.println("The sum of the first five numbers: " + sum);
        }
        if (b == false) {
            for (i = array.length / 2 - 1; i < array.length; i++) {
                prod = prod * array[i];
            }
            System.out.println("The product of the last five numbers: " + prod);
        }
    }

    public static int[] inputNumbers() throws IOException {
        System.out.println("Print ten numbers");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[]{
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())};
        System.out.println("numbers = " + Arrays.toString(numbers));
        return numbers;
    }

    public static void main(String[] args) throws IOException {
        inputAndCheckNumbers();
    }
}
