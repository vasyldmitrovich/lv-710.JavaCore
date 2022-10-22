package com.softserve.hw12.Tasks;

import static com.softserve.edu12.Tasks.PrintThread.printTextWithInterval;

public class Task1 {
    public static void run() {
        Thread thread1 = printTextWithInterval("Thread 1",5,10);
        Thread thread2 = printTextWithInterval("Thread 2", 5,10);
        Thread thread3 = new Thread(() ->{
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            printTextWithInterval("Thread 3",5,0).start();
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
