package com.softserve.Arrays;

public class ArrayTwoPerebor {
    public static void main(String[] args) {
        char[][] ArrayChar = {
                {'r', 'r', 'r'},
                {'4', '6', '5'},
        };
        for (char[] ArrayOne : ArrayChar) {
            for (char element : ArrayOne) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
