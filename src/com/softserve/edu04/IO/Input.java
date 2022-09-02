package com.softserve.edu04.IO;

import java.util.Scanner;

public class Input implements In{
    private final Scanner sc;

    public Input() {
        sc = new Scanner(System.in);
    }

    private void printMsg(String... msg) {
        if (msg != null) {
            for (String msg1 : msg) System.out.print(msg1);
        }
    }

    @Override
    public int readInt(String... msg) {
        printMsg(msg);
        return sc.nextInt();
    }
    @Override
    public String readString(String... msg) {
        printMsg(msg);
        return sc.nextLine();
    }
    @Override
    public double readDouble(String... msg) {
        printMsg(msg);
        return sc.nextDouble();
    }

    @Override
    public boolean readBoolean(String... msg) {
        printMsg(msg);
        return sc.nextBoolean();
    }

    public void close() {
        sc.close();
    }
}
