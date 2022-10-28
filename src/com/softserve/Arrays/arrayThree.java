package com.softserve.Arrays;

public class arrayThree {
    public static void main(String[] args) {
        int[][][] arrayTwo = new int[2][2][2];
        int i, j, k, n = 0;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                for (k = 0; k < 2; k++) {
                    arrayTwo[i][j][k] = n++;
                    System.out.print(arrayTwo[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
