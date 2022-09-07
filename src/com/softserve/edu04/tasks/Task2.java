package com.softserve.edu04.tasks;

import com.softserve.edu04.DayOfTheWeek;

public class Task2 {
    public static void main(String[] args) {
        DayOfTheWeek dayOfTheWeek = DayOfTheWeek.getByNumber(5);
        System.out.println(dayOfTheWeek.getEn());
        System.out.println(dayOfTheWeek.getEs());
        System.out.println(dayOfTheWeek.getUa());

    }


    }