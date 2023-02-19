package com.softserve.edu05.practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// READY!!
public class Numbers10 {
    public static void checkNumbers() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        int n4 = Integer.parseInt(br.readLine());
        int n5 = Integer.parseInt(br.readLine());
        int n6 = Integer.parseInt(br.readLine());
        int n7 = Integer.parseInt(br.readLine());
        int n8 = Integer.parseInt(br.readLine());
        int n9 = Integer.parseInt(br.readLine());
        int n10 = Integer.parseInt(br.readLine());

        int[] numbers = new int[]{n1, n2, n3, n4, n5, n6, n7, n8, n9, n10};
        int sumPos = 0;
        int sumNeg = 0;
        int countPos = 0;
        int countNeg = 0;
        int i;
        int biggest = numbers[0];

        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggest) {
//                int biggest = numbers[i];
                biggest = numbers[i];
            }
            if (numbers[i] > 0) {
                sumPos = sumPos + numbers[i];
                countPos++;
            }
            if (numbers[i] < 0) {
                sumNeg = sumNeg + numbers[i];
                countNeg++;
            }
        }

        if (countPos > countNeg) {
            System.out.println("There are more positive values than negative ones");
        } else {
            System.out.println("There are more negative values than positive ones");
        }
        System.out.println("The sum of positive numbers: " + sumPos);
        System.out.println("The sum of negative numbers: " + sumNeg);
        System.out.println("Biggest number: " + biggest);
    }

    public static void main(String[] args) throws IOException {
        checkNumbers();
    }
}