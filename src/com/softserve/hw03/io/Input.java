package com.softserve.hw03.io;

import java.util.Scanner;

public class Input {

    private final Scanner sc = new Scanner(System.in);

    public String inputString() {
        return sc.nextLine();
    }

    public String inputFirstName() {
        System.out.println("Input First Name");
        return inputString();
    }

    public String inputLastName() {
        System.out.println("Input Last Name");
        return inputString();
    }

    public String inputBirthDate() {
        System.out.println("Input Birth date: yyyy-mm-dd");
        return inputString();
    }
}
