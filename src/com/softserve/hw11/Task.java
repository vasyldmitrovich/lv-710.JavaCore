package com.softserve.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create method div(), which calculates the dividing of two double numbers. In main method input
 * 2 double numbers and call this method. Catch all exceptions.
 * Write a method readNumber(int start, int end), that read from console integer number
 * and return it, if it is in the range [start...end].
 * If an invalid number or non-number text is read, the method should throw an exception.
 * Using this method write a method main(), that has to enter 10 numbers:
 * a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 */
public class Task {
    public void run() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //1
            System.out.println("Enter first number:");
            double a = Double.parseDouble(reader.readLine().replace(",", "."));
            System.out.println("Enter second number:");
            double b = Double.parseDouble(reader.readLine().replace(",", "."));
            System.out.println(div(a, b));
            //2
            readNumber(5, 10);
            //3
//            int current = readNumber(1, 100);
//            for (int i = 0; i < 10; i++) {
//                current = readNumber(current, 100);
            readNumber(readNumber(readNumber(readNumber(readNumber(readNumber(readNumber(readNumber(
                    readNumber(readNumber(1, 100), 100), 100), 100), 100), 100), 100), 100), 100), 100);

        } catch (IndexOutOfBoundsException | NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    private double div(double a, double b) {
        return a / b;
    }

    private int readNumber(int start, int end) throws IndexOutOfBoundsException, IOException {
        int a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Range is [%d-%d]. Enter integer number:", start, end);
        a = Integer.parseInt(reader.readLine());
        if (start > a || a > end) {
            throw new IndexOutOfBoundsException(String.format("%d - Out Of Bounds [%d-%d]", a, start, end));
        }
        System.out.println(a + " ok");
        return a;
    }

}
