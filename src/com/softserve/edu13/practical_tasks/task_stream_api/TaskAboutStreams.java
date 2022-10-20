package com.softserve.edu13.practical_tasks.task_stream_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import static com.softserve.hw01.MessageHelper.readIntMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * @* Print n random numbers on console using Java 8 in a sorted order
 * @* Print n random numbers on console using Java 8
 * @* Using Java 8 show the biggest number from n random numbers
 * @* Show which today is a day of a week
 * @* Show a date of first Monday for current month
 * @* Write a method for sorting list of Strings using Java 8
 */
public class TaskAboutStreams {

    public void run() {
        printSortedRandomNumbers();

        printRandomNumbers();

        printBiggestRandomNumber();

        printToday();

        printFirstMondayForCurrentMonth();

        sortListStrings(List.of("cccfg", "ddd", "bbbor", "aaaaa", "list", "eeae", "java"))
                .forEach(System.out::println);
    }


    private int getQuantity() {
        writeMessage("Type in the console how many random numbers you need.");
        return readIntMessage();
    }

    private void printSortedRandomNumbers() {
        ThreadLocalRandom.current().ints(getQuantity())
                .sorted()
                .forEach(System.out::println);
    }

    private void printRandomNumbers() {
        ThreadLocalRandom.current().ints(getQuantity())
                .forEach(System.out::println);
    }

    private void printBiggestRandomNumber() {
        ThreadLocalRandom.current().ints(getQuantity())
                .max()
                .ifPresent(System.out::println);
    }

    private void printToday() {
        System.out.println("today is " + LocalDate.now().getDayOfWeek());
    }

    private void printFirstMondayForCurrentMonth() {
        System.out.println("date of the first Monday of the current month is "
                + LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
    }

    private List<String> sortListStrings(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
