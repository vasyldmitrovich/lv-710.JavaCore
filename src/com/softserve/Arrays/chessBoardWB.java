package com.softserve.Arrays;

public class chessBoardWB {
    public static void main(String[] args) {
        char w = 'W';
        char b = 'B';
        char v = 'a';
        String[][] twoDimArray = new String[8][8];
        {
            for (int i = 0, k =8; i < twoDimArray.length; i++, k--) {

                for (int j = 0; j < twoDimArray[i].length; j++) {

                    if (j % 2 == 0) {
                        twoDimArray[i][j] = w + "" + v + k;
                        System.out.print(twoDimArray[i][j] + " ");

                    } else {
                        twoDimArray[i][j] = b + "" + v + k;
                        System.out.print(twoDimArray[i][j] + " ");
                    }
                }
                v++;
                System.out.println();
            }
        }
    }
}








