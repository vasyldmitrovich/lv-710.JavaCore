package com.softserve.edu14LambdaDate.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MyBDayDemo {
    public static void main(String[] args) {
        LocalDate myBDay = LocalDate.of(1989, 8, 3);
        System.out.println(returnDayOfWeek(myBDay));
    }

    public static String returnDayOfWeek(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", Locale.ENGLISH);
        LocalDate newDate6 = date.plusMonths(6);
        LocalDate newDate12 = date.plusMonths(12);

        return date.format(formatter).concat("\n").concat(newDate6.format(formatter)
                .concat("\n").concat(newDate12.format(formatter)));
    }
}