package com.softserve.edu01.hw;

import java.util.Scanner;

public class PhoneCalls {
    public static void main(String[] args) {
        System.out.println("Please enter the time for each call, separated by a space ");
        Scanner scanner = new Scanner(System.in);
        double t1 = scanner.nextDouble();
        double t2 = scanner.nextDouble();
        double t3 = scanner.nextDouble();

        System.out.println("Please enter a cost per minute for each call, separated by a space");
        Scanner scanner1 = new Scanner(System.in);
        double c1 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        double c3 = scanner.nextDouble();

        System.out.println("Cost of the first call " + t1 * c1);
        System.out.println("Cost of the second call " + t2 * c2);
        System.out.println("Cost of the thred call " + t3 * c3);
        System.out.println("Cost of all calls " + (t1 * c1 + t2 * c2 + t3 * c3));

        scanner.close();
        scanner1.close();

    }
}
