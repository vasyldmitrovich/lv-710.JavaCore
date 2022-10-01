package com.softserve.hw01;

import java.util.Scanner;

public class Questions {

    Scanner in = new Scanner(System.in);
    private String name;

    private String nameQuestion() {
        System.out.println("What is your name?");
        return name = in.nextLine();
    }

    public void livingQuestion() {
        System.out.println("Where are you live, " + nameQuestion() + "?");
    }

    public void addressQuestion() {
        livingQuestion();
        System.out.println(name + "\n" + in.nextLine());
    }
}
