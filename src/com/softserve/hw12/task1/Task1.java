package com.softserve.hw12.task1;


import com.softserve.edu12.practical_tasks.task1.TaskCreator;

/**
 * Run three threads and output there different messages for 5 times.
 * The third thread supposed to start after finishing working of the two previous threads.
 */
public class Task1 {
    public void run() {
        Thread firstThread = new Thread(() ->
            new TaskCreator("text1", 5, 100L).printTextWithIntervals());

        Thread secondThread = new Thread(() ->
            new TaskCreator("text2", 5, 100L).printTextWithIntervals());

        Thread thirdThread = new Thread(() -> {
            try {
                firstThread.join();
                secondThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new TaskCreator("text3", 5, 100L).printTextWithIntervals();
        });

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}
