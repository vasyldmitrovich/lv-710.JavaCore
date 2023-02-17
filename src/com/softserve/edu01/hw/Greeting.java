package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {

    public Greeting() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        System.out.println("What is your name?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] name = new String[]{br.readLine()};
        for (String partOfName :
                name) {
            System.out.println("Where are do you live, " + partOfName + " ?" + " Write the street name and house number");
//            String a = br.readLine();
//        String b = br.readLine();
//            System.out.println("Where are do you live, " + a + " ?");

            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//            String[] address = new String[]{br1.readLine()};
//            for (String world1 :
//                    address)
            String street = br1.readLine();
            String numberOfBuild = br1.readLine();

            System.out.print("Your name is " + partOfName + "\nYour address is " + street + numberOfBuild);

            br.close();
            br1.close();
        }
    }
}


