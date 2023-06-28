package com.softserve.edu15Thread.practik;

public class Ex1 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0;i<10;i++){
                System.out.println("I study Java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
