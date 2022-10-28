package com.softserve.ex1;

import java.util.Objects;
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner monthScanner = new Scanner(System.in);
        System.out.println("введите название месяца");
        String month = monthScanner.next();

        String a = "январь", b = "февраль", c = "март", d = "апрель", e = "май", f = "июнь";
        String g = "июль", h = "август", i = "сентябрь", j = "октябрь", k = "ноябрь", l = "декабрь";

        if (Objects.equals(month, a) || Objects.equals(month, b) || Objects.equals(month, l)) {
            System.out.println("Зима");

        } else if (Objects.equals(month, c) || Objects.equals(month, d) || Objects.equals(month, e)) {

            System.out.println("Весна");

        } else if (Objects.equals(month, f) || Objects.equals(month, g) || Objects.equals(month, h)) {
            System.out.println("Лето");

        } else if (Objects.equals(month, i) || Objects.equals(month, j) || Objects.equals(month, k)) {
            System.out.println("Осень");

        } else

            System.out.println("нет такого месяца");
    }
}