package com.softserve.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[][] array = {{51, 136, 387}, {34, 45, 56}, {4, 5, 6}};
//        int[][] array = new int[3] [3];
//        for (int i = 0; i < array.length; i++) {
//
//            System.out.println(array[i]);
//        }
//        System.out.println(array[0] + " " + array[1]);
//    }

//        int i, j, k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
