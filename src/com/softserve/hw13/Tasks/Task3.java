package com.softserve.hw13.Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public static void run() {
        System.out.println(formatDate(LocalDate.now()));
    }

    public static String formatDate(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.yy");
        return date.format(format);
    }
}
