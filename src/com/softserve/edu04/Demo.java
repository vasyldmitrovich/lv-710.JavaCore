package com.softserve.edu04;

import com.softserve.hw03.InputReader;
import java.io.IOException;

public class Demo {

    private static void showDayName() throws IOException {
        int userInput;
        System.out.print("Enter day number: ");
        userInput = InputReader.getInputInt();

        switch (userInput) {
            case 1:
                System.out.println(DayOfWeek.MONDAY.getEn() + "\n" +
                        DayOfWeek.MONDAY.getDe() + "\n" +
                        DayOfWeek.MONDAY.getUa());
                break;
            case 2:
                System.out.println(DayOfWeek.TUESDAY.getEn() + "\n" +
                        DayOfWeek.TUESDAY.getDe() + "\n" +
                        DayOfWeek.TUESDAY.getUa());
                break;
            case 3:
                System.out.println(DayOfWeek.WEDNESDAY.getEn() + "\n" +
                        DayOfWeek.WEDNESDAY.getDe() + "\n" +
                        DayOfWeek.WEDNESDAY.getUa());
                break;
            case 4:
                System.out.println(DayOfWeek.THURSDAY.getEn() + "\n" +
                        DayOfWeek.THURSDAY.getDe() + "\n" +
                        DayOfWeek.THURSDAY.getUa());
                break;
            case 5:
                System.out.println(DayOfWeek.FRIDAY.getEn() + "\n" +
                        DayOfWeek.FRIDAY.getDe() + "\n" +
                        DayOfWeek.FRIDAY.getUa());
                break;
            case 6:
                System.out.println(DayOfWeek.SATURDAY.getEn() + "\n" +
                        DayOfWeek.SATURDAY.getDe() + "\n" +
                        DayOfWeek.SATURDAY.getUa());
                break;
            case 7:
                System.out.println(DayOfWeek.SUNDAY.getEn() + "\n" +
                        DayOfWeek.SUNDAY.getDe() + "\n" +
                        DayOfWeek.SUNDAY.getUa());
                break;
            default:
                System.out.println("wrong data");
                showDayName();
        }
    }

    public static void getCountryInfoFromCountry() throws IOException {
        String countryInput;
        System.out.print("\nEnter country name: ");
        countryInput = InputReader.getInputString();

        for (Country i : Country.values()) {
            if (i.getCountry().equals(countryInput))
                System.out.println("Country " + i.getCountry()
                        + " placed on " + i.getContinent() + " continent.");
        }
    }

    public static void demonstration() throws IOException {
        CheckOdd co1 = new CheckOdd();
        System.out.println("\nEnter three numbers. " +
                "Find out how many of them are odd.");
        co1.checkOdd();

        System.out.println("\nEnter number of the day of the week." +
                " Display the name in three languages.");
        showDayName();

        System.out.println("\nEnter name of the country. " +
                "Print the name of the continent.");
        getCountryInfoFromCountry();

        System.out.println("\nCreate class Product. " +
                "Create four instances of type Product." +
                "\nDisplay the name and quantity of the most expensive item." +
                "\nDisplay the name of the items, " +
                "which has the biggest quantity.");
        CompareProduct.demonstration();

    }
}
