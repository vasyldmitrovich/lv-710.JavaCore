
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatIsYourName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello. What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live," + name + "?");
        String address = br.readLine();


        System.out.println("You are " + name +" and you live in " + address);

    }}
