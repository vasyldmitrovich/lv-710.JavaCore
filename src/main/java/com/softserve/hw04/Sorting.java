package com.softserve.hw04;

public class Sorting {

    public int[] sorting(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int t = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = t;
                }
            }
        }
        for (int value : values) {
            System.out.println(value);
        }
        return values;
    }
}
