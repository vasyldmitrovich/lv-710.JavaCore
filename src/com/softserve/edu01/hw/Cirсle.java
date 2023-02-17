package com.softserve.edu01.hw;

import java.io.IOException;
import java.util.Scanner;

public class Cirсle {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the radius of the circle");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        scanner.close();

        System.out.println("Perimeter of the circle: " + (int) (2 * Math.PI * r));
        System.out.println("Area of the circle: " + (int) (Math.PI * r * r));
    }
}
