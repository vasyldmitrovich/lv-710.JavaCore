package com.softserve.Arrays;

public class chessBoard {
    public static void main(String[] args) {
        char v = 'a';
        String[][] twoDimArray = new String[8][8];
        {
            for (int i = 0; i < twoDimArray.length; i++) {

                for (int j = 0; j < twoDimArray[i].length; j++) {

                    twoDimArray[i][j] = v + "" + (j + 1);

                    System.out.print(twoDimArray[i][j] + " ");
                }
                v++;
                System.out.println();
            }

        }
    }
}

