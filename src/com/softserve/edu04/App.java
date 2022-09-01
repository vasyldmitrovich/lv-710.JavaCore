package com.softserve.edu04;

import com.softserve.edu04.Logic.Task1;
import com.softserve.edu04.Logic.Task2;
import com.softserve.edu04.Logic.Task3;
import com.softserve.edu04.Logic.Task4;

public class App {
    public static void main(String[] args) {
        runTaskNumber(4);
    }

    private static void runTaskNumber(int task) {
        switch (task) {
            case 1:
                System.out.println("Task 1");
                Task1.run();
                break;
            case 2:
                System.out.println("Task 2");
                Task2.run();
                break;
            case 3:
                System.out.println("Task 3");
                Task3.run();
                break;
            case 4:
                System.out.println("Task 4");
                Task4.run();
                break;
        }
    }
}
