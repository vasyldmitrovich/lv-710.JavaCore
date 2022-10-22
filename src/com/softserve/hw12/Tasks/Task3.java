package com.softserve.hw12.Tasks;

import static com.softserve.edu12.Tasks.PrintThread.printTextWithInterval;

public class Task3 {
    public static void run(){
        //Same comment )))
        Thread thread2 = new Thread(() -> printTextWithInterval("Thread number two",3,0).start());
        Thread thread1 = new Thread(thread2::start);
        thread1.start();
        printTextWithInterval("Thread number three",5,0).start();
    }
}
