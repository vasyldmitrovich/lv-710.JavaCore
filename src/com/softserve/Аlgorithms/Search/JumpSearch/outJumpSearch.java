package com.softserve.Аlgorithms.Search.JumpSearch;

import com.softserve.Аlgorithms.Search.BinarySearch.Iterative;

import java.util.Arrays;

public class outJumpSearch {
    public static void main(String[] args) {
        int[] array = {0, 7, 14, 18, 20, 23, 25, 27, 30, 33, 37, 40, 45, 48, 49, 55, 60, 62, 69, 70, 75, 80};
        int elementToSearch = 80;
        int firstElement = 0;
        int lastElement = 21;

        System.out.print(Arrays.toString(array));
        System.out.println();

//        System.out.println( Recursive.binarySearch(array, firstElement, lastElement, elementToSearch));
        System.out.println(JumpNN.jumpSearchN(array,elementToSearch));

    }
}

