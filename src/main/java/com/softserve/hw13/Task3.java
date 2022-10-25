package com.softserve.hw13;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task3 {

    public static void run() {
        new Task3().parseStringToDate();
    }

    private LocalDate parseStringToDate() {
        System.out.println("Enter the start date: YYYY-MM-DD.");
        LocalDate localDate;
        try {
            localDate = LocalDate.parse(new Scanner(System.in).nextLine());
        } catch (DateTimeParseException e) {
            e.fillInStackTrace();
            System.out.println("Inputted date format is invalid.\nPlease input valid date format:");
            localDate = parseStringToDate();
        }
        return localDate;
    }
}
