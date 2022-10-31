package com.softserve.hw12;

public class Task1 implements Runnable{
    String threadName;

    public Task1(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run(){
        for (int i = 0; i <5 ; i++) {
            if (threadName == "Thread 1"){
                this.message1();
            } else if (threadName == "Thread 2") {
                this.message2();
            }else {
                this.message3();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
    }

    public void message1(){
        System.out.println("One");
    }
    public void message2(){
        System.out.println("Two");
    }
    public void message3(){
        System.out.println("Three");
    }
}
