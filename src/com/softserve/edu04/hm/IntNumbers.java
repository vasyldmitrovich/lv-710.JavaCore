package com.softserve.edu04.hm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// READY !!
public class IntNumbers {

    public static void intNumbers() throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(bufferedReader.readLine());
        int i2 = Integer.parseInt(bufferedReader.readLine());
        int i3 = Integer.parseInt(bufferedReader.readLine());
        int[] intArray = new int[3];
        intArray = new int[]{i1, i2, i3};
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

    public static void main(String[] args) throws IOException {
        intNumbers();

    }
}
