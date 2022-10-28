package com.softserve.Arrays;

public class MultiplyTwoDimArray {
    public static void main(String[] args) {

        int[][] Arr1 = {
                {1, 4, 9},
                {3, 7, 9}
        };
        int[][] Arr2 = {
                {2, 6},
                {2, 8},
                {1, 4}
        };
        int[][] Arr3 = new int[Arr1.length][Arr2[0].length];
        int i, j = 0;
        for (i = 0; i < Arr1.length; i++) {


            for (j = 0; j < Arr2[0].length; j++) {


                for (int k = 0; k < Arr1[0].length; k++) {
                    Arr3[i][j] = Arr3[i][j] + Arr1[i][k] * Arr2[k][j];
                }
            }
        }
            for (i = 0; i < Arr3.length; i++) {
                for (j = 0; j < Arr3[0].length; j++) {
                    System.out.print(Arr3[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


//  i k     k  j     2 3   3 2
//  i i