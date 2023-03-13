package com.softserve.edu05.practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// READY!!
public class Numbers10 {
    public static void runApp() throws IOException {
        System.out.println("Print ten numbers");
        inputNumbers();
    }

    public static int[] foundBiggestNumber(int[] n) throws IOException {
        int biggest = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > biggest) {
                biggest = n[i];
            }
        }
        System.out.println("Biggest number: " + biggest);
        return n;
    }

    public static Object foundSumPosNumbers(int[] n) throws IOException {
        int sumPos = 0;
        for (int i = 0; i < n.length; i++) {

            if (n[i] > 0) {
                sumPos = sumPos + n[i];
            }
        }
        System.out.println("The sum of positive numbers: " + sumPos);
        return null;
    }

    /*If you do not return nothing then make return type void. Make this rules for all method*/
    public static Object foundAmountNegNumbers(int[] n) {
        int sumNeg = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < 0) {
                sumNeg = sumNeg + n[i];
            }
        }
        System.out.println("The sum of negative numbers: " + sumNeg);
        return null;
    }

    public static Object compQuantPosNegNumbers(int[] n) {
        int countPos = 0;
        int countNeg = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                countPos++;
            }
            if (n[i] < 0) {
                countNeg++;
            }
        }
        if (countPos > countNeg) {
            System.out.println("There are more positive values than negative ones");
        } else {
            System.out.println("There are more negative values than positive ones");
        }
        return null;
    }

    public static Object inputNumbers() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[]{
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())};
        System.out.println("numbers = " + Arrays.toString(numbers));
        return foundBiggestNumber(numbers) + "" + foundSumPosNumbers(numbers) + ""
                + foundAmountNegNumbers(numbers) + "" + compQuantPosNegNumbers(numbers);
    }

    public static void main(String[] args) throws IOException {
        runApp();
    }
}