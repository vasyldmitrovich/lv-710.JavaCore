package com.softserve.hw13;

import com.softserve.hw13.tasks.Task1;
import com.softserve.hw13.tasks.Task2;
import com.softserve.hw13.tasks.Task3;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        new Task1().run();
        new Task2().run();
        System.out.println(new Task3().formatDate(LocalDate.now()));
    }
}
