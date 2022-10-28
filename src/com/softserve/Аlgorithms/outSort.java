package com.softserve.Аlgorithms;

import java.util.Arrays;

public class outSort {
    public static void main(String[] args) {
        int[][] array = {
                {},
                {1},
                {2, 6, 8, 0,},
                {5, 7, 3, 5, 8, 2, 9, 1, 0},
        };
        for (int[] mas : array) {
            System.out.print(Arrays.toString(mas) + " => ");
            SelectionSorter.sort(mas);
            System.out.println(Arrays.toString(mas));


        }
    }
}