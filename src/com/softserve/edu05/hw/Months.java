package com.softserve.edu05.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// READY!!
public class Months {


    public static void months() throws IOException {

        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfMonth = Integer.parseInt(br.readLine());
        for (int i = 0; i < months.length; ) {
            if (numberOfMonth == i + 1) {
                System.out.println(months[i] + " days this month");
            }
            if (numberOfMonth > months.length) {
                System.out.println("Error. The month with this number does not exist");
                System.exit(0);
            }
            i++;
        }
    }

    public static void main(String[] args) throws IOException {
        months();
    }
}
