package com.softserve.FileAndException;

import java.io.IOException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner4 = new Scanner(System.in);
            String line = scanner4.nextLine();
            int x = Integer.parseInt(line);
            if (x !=0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
        }
    }
}
