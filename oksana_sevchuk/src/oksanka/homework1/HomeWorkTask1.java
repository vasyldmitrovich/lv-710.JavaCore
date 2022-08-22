package oksanka.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkTask1 {
    static final double Pi = 3.14;
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader consoleReader = new BufferedReader(inputStreamReader);

        String messageParameter = "Hello, enter the radius";

        System.out.println(messageParameter);
        String lineOfText = consoleReader.readLine();
        double radius = Double.parseDouble(lineOfText);
        System.out.println("Hello, your perimetr is " + calculatePerimeter(radius));
        System.out.println("Your area is " + calculateArea(radius));
    }

    public static double calculatePerimeter(double radius) {
        return 2 * Pi * radius;
    }
    public static double calculateArea(double radius) {
        return Pi * radius * 2;


    //Area = π × r2,
// perimeter = 2 * Pi * r
}}
