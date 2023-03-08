package com.softserve.edu04.hm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// READY !!
public class FloatNumbers {
    public static void runMyApp() throws IOException {
        checkFloatNumbers(inputNumbers());
    }

    public static void checkFloatNumbers(float[] numbers) {
        {
            for (Float number :
                    numbers) {
                String s = number >= -5 && number <= 5 ? " number satisfies the condition" : " number does not satisfy the condition";

                System.out.println(number + s);
            }
        }
    }

    public static float[] inputNumbers() throws IOException {
        System.out.println("Print three float numbers");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float[] numbers = new float[]{
                Float.parseFloat(br.readLine()), Float.parseFloat(br.readLine()), Float.parseFloat(br.readLine())};
        System.out.println("numbers = " + Arrays.toString(numbers));
        return numbers;
    }

    public static void main(String[] args) throws IOException {
        runMyApp();
    }
}