package com.softserve.Аlgorithms;

import java.util.Arrays;

public class ArrayInverter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size = array.length;
        int i;
        for (i = 0; i < size / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print(Arrays.toString(array) + " ");
    }
}
