package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {

    public static void main(String[] args) throws IOException {
        System.out.println("What is your name?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("Where you live?");
        String adress = br.readLine();
        System.out.println("Your name is " + name);
        System.out.println("Your adress is " + adress);
    }
}

