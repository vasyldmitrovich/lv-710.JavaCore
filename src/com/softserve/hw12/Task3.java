package com.softserve.hw12;

public class Task3 extends Thread {

    public void task3(){

        Thread thread2 = new Thread(() ->print("Thread number two", 3).start());
        Thread thread1 = new Thread(thread2::start);
        thread1.start();
        Thread thread3 = new Thread(() -> print("Thread number three",5).start());
        thread3.start();
    }

    public static Thread print(String message, int count){
        return new Thread(() -> {
            for (int i = 0; i < count; i++) {
                System.out.println(message);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
    }
}



