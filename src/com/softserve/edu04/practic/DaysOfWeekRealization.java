package com.softserve.edu04.practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.softserve.edu04.practic.DaysOfWeek.*;

public class DaysOfWeekRealization {
    public static void showNamesOfDay() throws IOException {
        System.out.println("please input number of day");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        switch (i) {
            case 1:
                System.out.println(SUNDAY.toString());
                break;
            case 2:
                System.out.println(MONDAY.toString());
                break;
            case 3:
                System.out.println(TUESDAY.toString());
                break;
            case 4:
                System.out.println(WEDNESDAY.toString());
                break;
            case 5:
                System.out.println(THURSDAY);
                break;
            case 6:
                System.out.println(FRIDAY.toString());
                break;
            case 7:
                System.out.println(SATURDAY.toString());
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        showNamesOfDay();
    }
}
