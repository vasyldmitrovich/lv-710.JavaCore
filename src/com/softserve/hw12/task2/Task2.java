package com.softserve.hw12.task2;

/**
 * Cause a deadlock. Organize the expectations of ending a thread in main(),
 * and make the end of the method main() in this thread.
 */
public class Task2 {
    public void run() {
        Thread main = Thread.currentThread();

        Thread thread = new Thread(() -> {
            try {
                main.join();
            } catch (InterruptedException ignore) {}
        });

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException ignore) {}
    }
}
