package com.softserve.hw12.Tasks;

public class Task2 {
    public static void run() {
        //I'm sorry, but the wording of the task is the same as the solution )))))
        Thread thread = new Thread();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.start();
    }
}
