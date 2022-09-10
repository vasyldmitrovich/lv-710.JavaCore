package com.softserve.edu04.tasks;

import com.softserve.edu04.DayOfTheWeek;

import static com.softserve.edu04.DayOfTheWeek.MONDAY;
import static com.softserve.edu04.DayOfTheWeek.TUESDAY;
import static com.softserve.edu04.DayOfTheWeek.WEDNESDAY;
import static com.softserve.edu04.DayOfTheWeek.THURSDAY;
import static com.softserve.edu04.DayOfTheWeek.FRIDAY;
import static com.softserve.edu04.DayOfTheWeek.SATURDAY;
import static com.softserve.edu04.DayOfTheWeek.SUNDAY;


public class Task2 {
    public static void main(String[] args) {
        DayOfTheWeek dayOfTheWeek = getByNumber(5);
        System.out.println(dayOfTheWeek.getEn());
        System.out.println(dayOfTheWeek.getEs());
        System.out.println(dayOfTheWeek.getUa());

    }
    public static DayOfTheWeek getByNumber(int dayOfTheWeekNumber) {
        switch (dayOfTheWeekNumber) {
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }

    }

    }