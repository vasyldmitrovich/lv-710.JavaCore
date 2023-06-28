package com.softserve.edu01Introduction.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
    static double t1;
    static double t2;
    static double t3;
    static double c1;
    static double c2;
    static double c3;

    public static void main(String[] args) throws IOException {
        returnDuration();
        returnCost();
        returnTotalCost();
    }

    public static void returnDuration() throws IOException {
        System.out.println("Please enter the time for three calls");
        t1 = returnData();
        t2 = returnData();
        t3 = returnData();
    }

    public static void returnCost() throws IOException {
        System.out.println("Please enter a cost per minute for three calls");
        c1 = returnData();
        c2 = returnData();
        c3 = returnData();
    }

    public static void returnTotalCost() throws IOException {
        System.out.println("Cost of the first call " + t1 * c1);
        System.out.println("Cost of the second call " + t2 * c2);
        System.out.println("Cost of the third call " + t3 * c3);
        System.out.println("Cost of all calls " + (t1 * c1 + t2 * c2 + t3 * c3));
    }

    public static Double returnData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double data = Double.valueOf(br.readLine());
        return data;
    }
}
