package com.softserve.edu05.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// READY!!
public class Numbers5 {
    public static void inputAndCheckNumbers() throws IOException {
        System.out.println("Print five numbers");
        checkNumbers(inputNumbers());
    }
        public static void checkNumbers (int[] array) {
            boolean b = true;
            int i;
            int p = 0;
            int min = array[0];
            int iMin = -1;
            int pro = 1;
            for (i = 0; i < array.length; i++) {
                {
                    if (array[i] % 2 == 0) {
                        pro = pro * array[i];
                    }
                    if (array[i] > 0) {
                        p++;
                        {
                            if (p == 2) {
                                System.out.println("Position of the second positive number = " + i);
                            }
                        }
                    }
                    if (array[i] <= array[0]) {
                        if (array[i] <= min) {

                            min = array[i];
                            iMin = i;
//                            тут хочу створити массив позицій минимальних значень
                        }
                    }
                    continue;
                }
            }
            System.out.println("The product of all even numbers = " + pro);
            System.out.println("Minimum = " + min + ", and its position in the array = " + iMin);
        }
    public static int[] inputNumbers() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[]{Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())};
        System.out.println("numbers = " + Arrays.toString(numbers));
        return numbers;
    }
    public static void main (String[]args) throws IOException {
            inputAndCheckNumbers();
        }
    }
