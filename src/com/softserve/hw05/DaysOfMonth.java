package com.softserve.hw05;

import java.util.Arrays;
import java.util.List;

class DaysOfMonth {

    private static List<Integer> DaysValue = Arrays.asList(
            31,
            28,
            31,
            30,
            31,
            30,
            31,
            31,
            30,
            31,
            30,
            31);

    private static List<String> MonthName = Arrays.asList(
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    );

    public static int getDaysOfMonth(int i) {
        return DaysValue.get(i -1);
    }

    public static String getMonthName(int i) {
        return MonthName.get(i -1);
    }

}
