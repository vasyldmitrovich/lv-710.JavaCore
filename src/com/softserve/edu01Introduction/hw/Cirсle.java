package com.softserve.edu01Introduction.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cirсle {
    public static void main(String[] args) throws IOException {
        calculate(returnRadius());
    }
        public static void calculate (int i) throws IOException {
            System.out.println("Perimeter of the circle: " + (int) (2 * Math.PI * i));
            System.out.println("Area of the circle: " + (int) (Math.PI * i*i));
        }
        public static int returnRadius () throws IOException {
            System.out.println("Please enter the radius of the circle");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int radius = Integer.parseInt(br.readLine());
            System.out.println("Radius = " + radius);
            return radius;
        }
    }
