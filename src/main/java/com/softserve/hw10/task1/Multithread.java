package com.softserve.hw10.task1;

import com.softserve.hw10.TaskManager;

public class Multithread extends Thread implements Runnable{

    @Override
    public void run() {
        Thread task1 = new Thread(() ->
                new TaskManager("process-1", 5, 1000L).printProcessStackTrace());

        Thread task2 = new Thread(() ->
                new TaskManager("process-2", 5, 2000L).printProcessStackTrace());

        Thread task3 = new Thread(() -> {
            try {
                task1.join();
                task2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new TaskManager("process-3", 5, 3000L).printProcessStackTrace();
        });

        task1.start();
        task2.start();
        task3.start();
    }
}
