package com.softserve.Arrays;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {

        int[] Array = {7, 3, 4, 6, 8, 9, 6, 4};

        Arrays.sort(Array);
        System.out.println(Arrays.toString(Array));

        int position1 = Arrays.binarySearch(Array, 7);
        System.out.println(position1);
    }

}