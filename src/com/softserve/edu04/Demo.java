package com.softserve.edu04;

import java.io.IOException;

public class Demo {
    public static void demonstration() throws IOException {
        CheckOdd co1 = new CheckOdd();
        System.out.println("\nEnter three numbers. " +
                "Find out how many of them are odd.");
        co1.checkOdd();

        System.out.println("\nEnter number of the day of the week." +
                " Display the name in three languages.");
        DayOfWeek.getDayName();

        System.out.println("\nEnter name of the country. " +
                "Print the name of the continent.");
        Country.getCountryInfo();

        System.out.println("\nCreate class Product. " +
                "Create four instances of type Product." +
                "\nDisplay the name and quantity of the most expensive item." +
                "\nDisplay the name of the items, " +
                "which has the biggest quantity.");
        CompareProduct.demonstration();
    }
}
