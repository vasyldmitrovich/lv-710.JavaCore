package com.softserve.hw12.task3;

import com.softserve.edu12.practical_tasks.task1.TaskCreator;

/**
 * Create a thread «one», which would start the thread «two», which has to
 * output its number («Thread number two») 3 times and create thread «three»,
 * which would to output message «Thread number three» 5 times.
 */
public class Task3 {
    public void run() {
        Thread two = new Thread(() -> {
            new TaskCreator("Thread number two", 3, 100L)
                    .printTextWithIntervals();

            Thread three = new Thread(() ->
                    new TaskCreator("Thread number three", 5, 100L)
                            .printTextWithIntervals());

            three.start();
        });
        Thread one = new Thread(two::start);
        one.start();
    }
}
