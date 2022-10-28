package com.softserve.Аlgorithms.Search.JumpSearch;

//public class Jump {
//    public static int jumpSearch(int[] array, int elementToSearch) {
//        int arrayLength = array.length;
//        int jumpStep = (int) Math.sqrt(array.length);
//        int previousStep = 0;
//
//        while (array[Math.min(jumpStep, arrayLength)-1] < elementToSearch) {
//            previousStep = jumpStep;
//            jumpStep += (int) (Math.sqrt(arrayLength));
//            if (previousStep >= arrayLength) {
//                return -1;
//            }
//        }
//        while (array[previousStep] < elementToSearch) {
//            previousStep++;
//            if (previousStep == Math.min(jumpStep, arrayLength)) {
//                return -1;
//            }
//        }
//
//        if (array[previousStep] == elementToSearch) {
//            return previousStep;
//        }
//        return -1;
//    }
//}
