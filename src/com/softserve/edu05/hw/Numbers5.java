package com.softserve.edu05.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// READY!!
public class Numbers5 {
    public static void checkNumbers() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        int n4 = Integer.parseInt(br.readLine());
        int n5 = Integer.parseInt(br.readLine());

        int[] numbers = new int[]{n1, n2, n3, n4, n5};
        boolean b = true;
        int i;
        int p = 0;
        int min = numbers[0];
        int iMin = -1;
        int pro = 1;

        for (i = 0; i < numbers.length; i++) {
            {
                if (numbers[i] % 2 == 0) {
                    pro = pro * numbers[i];
                }


                if (numbers[i] > 0) {
                    p++;
                    {
                        if (p == 2) {
                            System.out.println("Position of the second positive number = " + i);
                        }
                    }
                }
                if (numbers[i] < numbers[0]) {
                    if (numbers[i] < min) {

                        min = numbers[i];
                        iMin = i;
                    }
                }
                continue;

            }
        }
        System.out.println("The product of all even numbers = " + pro);
        System.out.println("Minimum = " + min + ", and its position in the array = " + iMin);
    }

    public static void main(String[] args) throws IOException {
        checkNumbers();
    }
}
