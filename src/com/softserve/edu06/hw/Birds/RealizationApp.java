package com.softserve.edu06.hw.Birds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealizationApp {
    public static void createBirds() {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(showMessageAndReturnInputData("What color of feathers?"),
                Integer.parseInt(showMessageAndReturnInputData("How many eggs a bird lays?")));
        birds[1] = new Swallow(showMessageAndReturnInputData("What color of feathers?"),
                Integer.parseInt(showMessageAndReturnInputData("How many eggs a bird lays?")));
        birds[2] = new Kiwi(showMessageAndReturnInputData("What color of feathers?"),
                Integer.parseInt(showMessageAndReturnInputData("How many eggs a bird lays?")));
        birds[3] = new Penguin(showMessageAndReturnInputData("What color of feathers?"),
                Integer.parseInt(showMessageAndReturnInputData("How many eggs a bird lays?")));
        for (Bird bird :
                birds) {
            System.out.println(bird.toString());
            bird.fly();
        }
    }

    public static String showMessageAndReturnInputData(String s) {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }

    public static void main(String[] args) {
        createBirds();
    }
}
