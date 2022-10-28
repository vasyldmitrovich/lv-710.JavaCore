package com.softserve.Аlgorithms.Search.BinarySearch;

public class Iterative {
    public static int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        while (firstIndex <= lastIndex) {
            int midleIndex = (firstIndex + lastIndex) / 2;
            if (array[midleIndex] == elementToSearch) {
                return midleIndex;
            } else if (array[midleIndex] < elementToSearch) {
                firstIndex = midleIndex + 1;
            } else if (array[midleIndex] > elementToSearch) {
                lastIndex = midleIndex - 1;
            }
        }
        return -1;
    }
}


