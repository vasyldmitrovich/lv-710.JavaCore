package com.softserve.edu15Thread.hw;

/**
 * In this class, we created a thread «one», which would start the thread «two»,
 * which has to output its name 3 times and create thread «three», which has to output its name 5 times.
 */
public class Ex3 {
    public static void main(String[] args) {
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName());
            }
            thread3.start();
        });
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            thread2.start();

        });
        thread1.start();
    }
}
