package com.company;

import java.util.Scanner;

public class Calculator {
    Scanner input = new Scanner(System.in);

    public void calculate () {
        double result;
        while (true) {
            System.out.println("Please, enter your mathematical operation");
            String inputString = input.nextLine();
            char[] inputStringArray = inputString.toCharArray();
            for (char benchmark : inputStringArray) {
                if (benchmark == '+') {
                    int indexOf = inputString.indexOf('+');
                    String numberA = inputString.substring(0, indexOf);
                    double a = Double.parseDouble(numberA);
                    String numberB = inputString.substring(indexOf + 1);
                    double b = Double.parseDouble(numberB);
                    result = a + b;
                    System.out.println("Your result is " + result);
                    break;
                } else if (benchmark == '-') {
                    int indexOf = inputString.indexOf('-');
                    String numberA = inputString.substring(0, indexOf);
                    double a = Double.parseDouble(numberA);
                    String numberB = inputString.substring(indexOf + 1);
                    double b = Double.parseDouble(numberB);
                    result = a - b;
                    System.out.println("Your result is " + result);
                    break;
                } else if (benchmark == '*') {
                    int indexOf = inputString.indexOf('*');
                    String numberA = inputString.substring(0, indexOf);
                    double a = Double.parseDouble(numberA);
                    String numberB = inputString.substring(indexOf + 1);
                    double b = Double.parseDouble(numberB);
                    result = a * b;
                    System.out.println("Your result is " + result);
                    break;
                } else if (benchmark == '/') {
                    int indexOf = inputString.indexOf('/');
                    String numberA = inputString.substring(0, indexOf);
                    double a = Double.parseDouble(numberA);
                    String numberB = inputString.substring(indexOf + 1);
                    double b = Double.parseDouble(numberB);
                    result = a / b;
                    System.out.println("Your result is " + result);
                    break;
                }
            }
            if (inputString.equals("stop")){
                break;
            }
        }
    }
}
