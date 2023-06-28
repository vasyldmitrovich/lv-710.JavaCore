package com.softserve.edu14LambdaDate.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatDemo {
    public static void main(String[] args) {
        System.out.println(checkData("03.23.20"));
    }
    public static boolean checkData (String data){
        Boolean condition = true;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate parseDate = LocalDate.parse(data, dateFormat);
        }catch (DateTimeParseException e){
            System.out.println("Your date does not match the format");
            condition = false;
        }
        return condition;
    }
}
