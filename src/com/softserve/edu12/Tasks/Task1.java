package com.softserve.edu12.Tasks;

public class Task1 {
    public static void run(){
        for (int i=0; i<10; i++){
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
