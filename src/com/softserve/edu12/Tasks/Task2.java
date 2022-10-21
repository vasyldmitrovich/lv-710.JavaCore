package com.softserve.edu12.Tasks;

public class Task2 {
    public static void run() {
        Thread t1 = printTextWithInterval("Hello world", 2000);
        Thread t2 = printTextWithInterval("Peace in peace", 3000);
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

    private static Thread printTextWithInterval(String message, long interval) {
        return new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(message);
                try {
                    if (i != 4) Thread.sleep(interval);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}