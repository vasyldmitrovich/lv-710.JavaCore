package com.softserve.hw01;

import com.softserve.io.Input;

import java.util.Scanner;

public class User {
    private static Scanner in = new Scanner(System.in);

    private int costPerMin;
    private int minutesAmount;
    private String name;

    public User() {
    }

    public User(String name, int cost, int min) {
        this.name = name;
        this.costPerMin = cost;
        this.minutesAmount = min;
    }

    public int getCostPerMin() {
        return costPerMin;
    }

    public int getMinutesAmount() {
        return minutesAmount;
    }

    public String getName() {
        return name;
    }

    public String inputName() {
        System.out.println("Input name...");
        return in.nextLine();
    }

    public int inputMinAmount() {
        System.out.println("Input minutes amount...");
        return in.nextInt();
    }

    public int inputCoastPerMin() {
        System.out.println("Input coast per min...");
        return in.nextInt();
    }
}
