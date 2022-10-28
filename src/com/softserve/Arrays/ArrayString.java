package com.softserve.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        char sym = 'a';
        String[][] arrayString = new String[5][7];
        int i, j = 0;
        int k = 1;
        for (i = 0; i < arrayString.length; i++) {
            for (j = 0; j < arrayString[i].length; j++) {
//                k = j+1;
                arrayString[i][j] = sym + "" + (1+j);
                System.out.print(arrayString[i][j] + " ");
            }
            sym++;
            System.out.println();
        }
    }
}