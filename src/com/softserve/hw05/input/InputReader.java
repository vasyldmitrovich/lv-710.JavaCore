package com.softserve.hw05.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
    private static final BufferedReader bf =
            new BufferedReader(new InputStreamReader(System.in));

    public static String getInputString() throws IOException {
        try {
            return bf.readLine();
        } catch (IOException e) {
            System.out.println("wrong data");
            return getInputString();
        }
    }

    public static int getInputInt() throws IOException {
        try {
            return Integer.parseInt(bf.readLine());
        } catch (NumberFormatException e) {
            System.out.println("wrong data");
            return getInputInt();
        }
    }

    public static float getInputFloat() throws IOException {
        try {
            return Float.parseFloat(bf.readLine());
        } catch (NumberFormatException e) {
            System.out.println("wrong data");
            return getInputFloat();
        }
    }

    public static double getInputDouble() throws IOException {
        try {
            return Double.parseDouble(bf.readLine());
        } catch (NumberFormatException e) {
            System.out.println("wrong data");
            return getInputDouble();
        }
    }
}
