package com.softserve.Arrays;

public class ArrayTwoDem0 {
    public static void main(String[] args) {
        int[][] arrayTwo = new int[3][4];
        int i, j, k = 0;
            for (i = 0; i < 3; i++)  {
                for (j = 0; j < 4; j++)  {
                    arrayTwo[i][j] = k++;
                    System.out.print(arrayTwo[i][j] + " ");
                }
                System.out.println();
            }
        }
    }



