package com.softserve.Аlgorithms;

public class Average {
    public static void main(String[] args) {

        double[] numbers = {4.3, 5.7, 1.8, 6.9};
        double result = 0;
        for (double d : numbers) {
            result += d;
        }
            System.out.println(result / numbers.length);
        }

    }

