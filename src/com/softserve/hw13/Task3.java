package com.softserve.hw13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public void task3(){
        System.out.println(dateValidation(LocalDate.now()));
    }

    public static String dateValidation(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        return date.format(formatter);
    }
}
