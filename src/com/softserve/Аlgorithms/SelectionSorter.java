package com.softserve.Аlgorithms;

public class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    pos = j;
                }
            }
            array[i] = array[pos];
            min = array[i];

        }
    }
}
