package com.softserve.edu12.practical_tasks.task2;

import com.softserve.edu12.practical_tasks.task1.Task1;

/**
 * Output two messages «Hello, world» and «Peace in the peace» 5 times each with
 * the intervals of 2 seconds, and the second - 3 seconds. After printing messages,
 * print the text «My name is …»
 */
public class Task2 {
    private static final String TEXT = "My name is Main, and I`m done!";

    public void run() {
        Thread threadPrintingHello = new Thread(() ->
                new Task1("Hello, world", 5, 2000L).printTextWithIntervals());

        Thread threadPrintingPeace = new Thread(() ->
                new Task1("Peace in the peace", 5, 3000L).printTextWithIntervals());

        threadPrintingHello.start();
        threadPrintingPeace.start();
        try {
            threadPrintingHello.join();
            threadPrintingPeace.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(TEXT);
    }
}

