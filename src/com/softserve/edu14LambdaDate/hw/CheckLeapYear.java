package com.softserve.edu14LambdaDate.hw;

import java.time.LocalDate;

public class CheckLeapYear {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2011, 03, 20);
        System.out.println(isYearLeap(date.getYear()));
    }

    public static boolean isYearLeap(int year) {
        if (year % 4 != 0) {
            return false;
        } else {
            if (year % 100 != 0) {
                return true;
            } else {
                if (year % 400 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}