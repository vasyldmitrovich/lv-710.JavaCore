package com.softserve.edu04;

public class Main {

    public static void main(String[] args) {

        //Task 1. Enter three numbers. Find out how many of them are odd.

        Numbers numbers = new Numbers(new int[3]);
        numbers.setNumbers();
        System.out.println("There are " + numbers.getAmountOfNumbers() + " numbers, and " +
                numbers.countOddNumbers() + " of them are odd");

        // Task 2. Enter the number of the day of the week. Display the name in three languages.

        DayOfWeek dayOfWeek = new DayOfWeek();
        dayOfWeek.setDayNumber();
        dayOfWeek.displayDayOfTheWeek();

        // Task 3. Enter the name of the country. Print the name of the continent.
        //         (Declare enum with names of continents)

          Country country = new Country();
          country.countryIsSituatedOnContinent();

        // Task 4. Create class Product with fields name, price and quantity.
        //         - Create four instances of type Product.
        //         - Display the name and quantity of the most expensive item.
        //         - Display the name of the items, which has the biggest quantity.

        Task4Realization task4Realization = new Task4Realization();
        task4Realization.displayMaxPrice();
        task4Realization.displayMaxQuantity();
    }
}
