package com.softserve.hw12;

public class Task2 {
    public void task2(){
        Thread thread = new Thread();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.start();
    }
}
