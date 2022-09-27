package com.softserve.edu04.Practical04.DayOfTheWeek;

public class WeekApp {
    public static void  main (String[] args) {
        Week week = new Week();
        System.out.println("Please enter a day of week:");
        week.setDay(week.inputInt());
        System.out.println(week.inDay(week.getDay()));
    }
}
