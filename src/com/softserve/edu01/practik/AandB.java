package com.softserve.edu01.practik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AandB {
    public static void main(String[] args) throws IOException {
        calculations(new BufferedReader(new InputStreamReader(System.in)));
    }

    public static void calculations(BufferedReader br) throws IOException {
        System.out.println("Please input two numbers");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a + b) + "\n" + "a - b = " + (a - b) + "\n" + "a * b = "
                + (a * b) + "\n" + "a / b = " + (a / b));
    }
}
