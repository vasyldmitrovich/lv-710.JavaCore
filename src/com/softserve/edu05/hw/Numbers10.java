package com.softserve.edu05.hw;

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
        int sum = 0;
        int prod = 1;
        boolean b = true;
        int i;

        for (i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] < 0) {
                b = false;
            }
        }
        if (b == true) {
            for (i = 0; i < numbers.length / 2; i++) {
                sum = sum + numbers[i];
            }
            System.out.println("The sum of the first five numbers: " + sum);
        }
        if (b == false) {
            for (i = numbers.length / 2 - 1; i < numbers.length; i++) {
                prod = prod * numbers[i];
            }
            System.out.println("The product of the last five numbers: " + prod);
        }
    }

    public static void main(String[] args) throws IOException {
        checkNumbers();
    }
}
