package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Greeting {
    public Greeting() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        System.out.println("What is your name?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] name = new String[]{br.readLine()};
//        for (String world:
//             name) {
//            System.out.println("Where are do you live, " + world + " ?");
        String a = br.readLine();
        String b = br.readLine();
        System.out.println("Where are do you live, " + a + b + " ?");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String address = br1.readLine();
//        for (String world1:
//                name) {
            System.out.println("Your name is " + a + b + "\nYour address is " + address);
        }

}
