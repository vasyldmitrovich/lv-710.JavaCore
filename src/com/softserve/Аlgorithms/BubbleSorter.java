package com.softserve.Аlgorithms;

import java.util.Arrays;

public class BubbleSorter {
    public static void sort(int[] array) {
//        int[] array = {2, 7, 3, 9, 5, 0, 4, 6, 1, 8};
        int size = array.length - 1;
        for (int i = 0; i < size; i++) {
            for (int j = size; j > 0; j--) {
                if (array[j - 1] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j - 1] = tmp;
                }

            }

//            System.out.println();
        }
//        System.out.print(Arrays.toString(array));
    }
}