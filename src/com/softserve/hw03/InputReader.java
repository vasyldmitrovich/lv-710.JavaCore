package com.softserve.hw03;

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
}
