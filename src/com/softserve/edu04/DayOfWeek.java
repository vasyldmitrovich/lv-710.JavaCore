package com.softserve.edu04;

import java.util.Scanner;

public class DayOfWeek {
    private static final Scanner input = new Scanner(System.in);
    private byte dayNumber;

    public void setDayNumber() {
        boolean dayNumberIsCorrect = false;
        System.out.println("Please, enter number of the day");
        while (!dayNumberIsCorrect) {
            try {
                this.dayNumber = Byte.parseByte(input.nextLine());
                while (!dayNumberIsCorrect) {
                    if (this.dayNumber < 1 || this.dayNumber > 7) {
                        System.out.println("You need to enter number from 1 to 7");
                    } else {
                        dayNumberIsCorrect = true;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("You need to enter number from 1 to 7");
            }
        }
    }

    public void displayDayOfTheWeek() {
        switch (this.dayNumber) {
            case 1 -> System.out.println("Monday, Montag, Понеділок");
            case 2 -> System.out.println("Tuesday, Dienstag, Вівторок");
            case 3 -> System.out.println("Wednesday, Mittwoch, Середа");
            case 4 -> System.out.println("Thursday, Donnerstag, Четвер");
            case 5 -> System.out.println("Friday , Freitag, П'ятниця");
            case 6 -> System.out.println("Saturday , Samstag, Субота");
            case 7 -> System.out.println("Sunday , Sonntag, Неділя");
        }
    }
}
