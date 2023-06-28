package com.softserve.edu15Thread.hw;
/**
 * Тhis class shows an example of such a state as deadlock
 * For the demonstration, one thread was created, and the second was the main method
 */
public class Ex2 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        System.out.println(Thread.currentThread().getName() + "start");

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "start");
            synchronized (lock1) {
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                }
            }
            System.out.println(Thread.currentThread().getName() + "finish");
        }, "thread1").start();

        synchronized (lock2) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock1) {
            }
        }
        System.out.println(Thread.currentThread().getName() + "finish");
    }
}

