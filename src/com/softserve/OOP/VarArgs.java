package com.softserve.OOP;

import java.util.Arrays;

public class VarArgs {
    static void test (int[] r, int...array) {
        for (int a: array
             ) {
            System.out.println("a: " + a );
        }
        System.out.println("колличество элементов: " + array.length );
        System.out.println("массив: " + Arrays.toString(r));

        System.out.println();
    }
    public static void main(String[] args) {
        test(new int[]{3,5,8},8, 3,6);
        test(new int[]{},6,9);

    }
}

