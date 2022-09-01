package com.softserve.hw04.IO;

import java.util.Scanner;

public class Input implements In {
    private Scanner sc;

    public Input() {
        sc = new Scanner(System.in);
    }

    private void printMsg(String... msg) {
        if (msg != null) {
            for (String msg1 : msg) System.out.print(msg1);
        }
    }

    public int readInt(String... msg) {
        printMsg(msg);
        return sc.nextInt();
    }
    public String readString(String... msg) {
        printMsg(msg);
        return sc.nextLine();
    }
    public double readDouble(String... msg) {
        printMsg(msg);
        return sc.nextDouble();
    }

    public void close() {
        sc.close();
    }
}
