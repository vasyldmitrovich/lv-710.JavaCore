package com.softserve.edu01.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Circle {

    public static void main(String[] args) throws IOException {

        System.out.print("напишіть радіус ");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int l = (int) (2.0 * r * Math.PI);
        int s = (int) (Math.PI * Math.pow(r, 2));
        System.out.println("Довжина окружності квітника " + l);
        System.out.println("Площа квітника " + s);
    }
}