package com.company;

import java.util.Scanner;

public class HowAreYou {
    Scanner input = new Scanner(System.in);

    public void answer() {
        System.out.println("How are you?");
        String answer = input.nextLine();
        System.out.println("You are " + answer);
    }
}