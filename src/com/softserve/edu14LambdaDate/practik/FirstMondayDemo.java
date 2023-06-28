package com.softserve.edu14LambdaDate.practik;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FirstMondayDemo {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        String firstMonday = currentDate.withDayOfMonth(1).with(DayOfWeek.MONDAY).format(formatter);

        System.out.println("Перший понеділок поточного місяця: " + firstMonday);
    }

}
