package com.softserve.io;

import java.util.Scanner;

public class Input {

    private static Scanner in = new Scanner(System.in);

    public static String inputString() {
        return in.nextLine();
    }

    public static int inputInteger() {
        return in.nextInt();
    }
}
