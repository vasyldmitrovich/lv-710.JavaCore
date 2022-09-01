package com.softserve.hw04.IO;

public class Output implements Out {
    public void print(String... msg) {
        for (String msg1 : msg) System.out.print(msg1);
        System.out.println();
    }
}
