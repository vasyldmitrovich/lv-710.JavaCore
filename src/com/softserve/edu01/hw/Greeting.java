package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {
    static String name;
    static String address;

    public static void main(String[] args) throws IOException {
        returnName();
        returnAddress();
    }

    public static void returnName() throws IOException {
        System.out.println("What is your name?");
        name = returnData();
    }

    public static void returnAddress() throws IOException {
        System.out.println("Where are do you live, " + name + " ?" + " Write the street name and house number");
        address = returnData();
        System.out.print("Your name is " + name + "\nYour address is " + address);
    }

    public static String returnData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        return data;
    }
}
