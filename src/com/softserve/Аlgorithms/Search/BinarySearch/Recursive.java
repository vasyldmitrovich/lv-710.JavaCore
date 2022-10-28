package com.softserve.Аlgorithms.Search.BinarySearch;

public class Recursive {
    public static int binarySearch(int[] array, int firstElement, int lastElement, int elementToSearch) {
        if (lastElement >= firstElement) {
            int midleElement = (lastElement + firstElement) / 2;

            if (array[midleElement] == elementToSearch) {
                return midleElement;
            }
            if (array[midleElement] > elementToSearch) {
                return binarySearch(array, firstElement, midleElement - 1, elementToSearch);
//                return (midleElement = (firstElement + (midleElement - 1)) / 2);
            }
            if (array[midleElement] < elementToSearch) {
                return binarySearch(array, midleElement + 1, lastElement, elementToSearch);
            }
        }
        return -1;
    }

}

