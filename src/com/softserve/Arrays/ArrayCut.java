package com.softserve.Arrays;

public class ArrayCut {
    public static void main(String[] args) {
        int[][] arrayCut = new int[5][];
        arrayCut[0] = new int[3];
        arrayCut[1] = new int[3];
        arrayCut[2] = new int[4];
        arrayCut[3] = new int[15];
        arrayCut[4] = new int[3];
        int i, j;
        int k = 0;
        for (i = 0; i < arrayCut.length; i++) {
            for (j = 0; j < arrayCut[i].length; j++) {
                arrayCut[i][j] = k++;

                System.out.print(arrayCut[i][j] + " ");
            }
            System.out.println();
        }
    }
}
