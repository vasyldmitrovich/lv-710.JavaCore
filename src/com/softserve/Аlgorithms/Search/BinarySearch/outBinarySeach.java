package com.softserve.Аlgorithms.Search.BinarySearch;

import java.util.Arrays;

public class outBinarySeach {
    public static void main(String[] args) {
        int[] array = {0, 7, 14, 18};
        int elementToSearch = 14;
        int firstElement = 0;
        int lastElement = 3;

            System.out.print(Arrays.toString(array));
            System.out.println();

//        System.out.println( Recursive.binarySearch(array, firstElement, lastElement, elementToSearch));
        System.out.println( Iterative.binarySearch(array, elementToSearch));

    }
}
