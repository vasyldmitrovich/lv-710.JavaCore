package com.softserve.hw13.tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Create method to validate date according to format "mm.dd.yy"
 */
public class Task3 {
    public String formatDate(LocalDate date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.yy");
        return date.format(format);
    }
}
