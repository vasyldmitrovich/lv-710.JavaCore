package com.softserve.Аlgorithms;

import java.util.Arrays;

public class BubbleSorterBoolean {
    public static void main(String[] args) {
        int[] mas = new int[]{1, 4, 5, 3, 8, 9, 6, 0, 7, 2};
        Boolean sortReady = false;
        int tmp;
        while (!sortReady) {
            sortReady = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    sortReady = false;

                    tmp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = tmp;

                }
//                System.out.println(mas[i]);
            }
            System.out.println(Arrays.toString(mas));
        }
    }
}
