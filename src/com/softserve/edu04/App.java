package com.softserve.edu04;

import com.softserve.edu04.IO.In;
import com.softserve.edu04.IO.Input;
import com.softserve.edu04.Logic.Task1;
import com.softserve.edu04.Logic.Task2;
import com.softserve.edu04.Logic.Task3;
import com.softserve.edu04.Logic.Task4;

public class App {
    public static void main(String[] args) {
        runTask();
    }

    private static void runTask() {
        In myIn = new Input();
        int task = myIn.readInt("What task to start with?(1-4) ");
        boolean andAllAfter = myIn.readBoolean("Do all the following?(true/false) ");
        switch (task) {
            case 1:
                System.out.println("Task 1");
                Task1.run();
                if (!andAllAfter) break;
            case 2:
                System.out.println("Task 2");
                Task2.run();
                if (!andAllAfter) break;
            case 3:
                System.out.println("Task 3");
                Task3.run();
                if (!andAllAfter) break;
            case 4:
                System.out.println("Task 4");
                Task4.run();
                break;
        }
    }
}
