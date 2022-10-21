package com.softserve.edu12.Tasks;

import static com.softserve.edu12.Tasks.PrintThread.printTextWithInterval;

public class Task2 {
    public static void run() {
        Thread t1 = printTextWithInterval("Hello world",5, 2000);
        Thread t2 = printTextWithInterval("Peace in peace",5, 3000);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My name is… Chupakabra!");
    }
}