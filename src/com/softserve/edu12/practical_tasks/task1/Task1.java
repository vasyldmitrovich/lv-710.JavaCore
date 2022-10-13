package com.softserve.edu12.practical_tasks.task1;

/**
 * Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).
 */
public class Task1 {
    public void run() {
        new TaskCreator("I study Java", 10, 1000L).printTextWithIntervals();
    }
}
