package com.softserve.edu04.practical_tasks.task2;


import static com.softserve.hw01.MessageHelper.*;

/**
 * Enter the number of the day of the week. Display the name in three languages.
 */
public class App {
    public static void main(String[] args) {
        WhatDayOfTheWeek();
    }

    private static void WhatDayOfTheWeek() {
        writeMessage("Enter the number from 1 to 7");
        int num = readIntMessage();
        switch (num) {
            case 1 : showResult(DayOfTheWeek.MONDAY);
                break;
            case 2 : showResult(DayOfTheWeek.TUESDAY);
                break;
            case 3 : showResult(DayOfTheWeek.WEDNESDAY);
                break;
            case 4 :showResult(DayOfTheWeek.THURSDAY);
                break;
            case 5 :showResult(DayOfTheWeek.FRIDAY);
                break;
            case 6 :showResult(DayOfTheWeek.SATURDAY);
                break;
            case 7 :showResult(DayOfTheWeek.SUNDAY);
                break;
            default:
                writeMessage("Allowable value range is 1 - 7");
        }
    }

    private static void showResult(DayOfTheWeek day) {
        writeMessage("Your choice:");
        writeMessage(day.toString());
    }
}