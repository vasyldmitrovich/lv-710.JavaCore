package com.softserve.Аlgorithms.Search.JumpSearch;

public class JumpN {
    public static int jumpSearch(int[] array, int elementToSearch) {
        int arrayLenght = array.length;
        int jumpStep = (int) Math.sqrt(arrayLenght);
        int previousStep = 0;

        while (array[Math.min(jumpStep, arrayLenght) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int) Math.sqrt(arrayLenght);
            ;
            if (previousStep >= arrayLenght) {
            }
            return -1;
        }
        while (array[previousStep] < elementToSearch) {
            previousStep += 1;
            if (previousStep == Math.min(jumpStep, arrayLenght)) {
            }
            return -1;
        }
        if (array[previousStep] == elementToSearch) {
            return previousStep;
        }
        return -1;
    }
}