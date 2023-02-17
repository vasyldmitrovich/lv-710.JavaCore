package com.softserve.edu04.practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// READY !!
public enum DaysOfWeek {
    SUNDAY(1, "неділя", "Sunday", "rrrr"),
    MONDAY(2, "понеділок", "Monday", "lundi"),
    TUESDAY(3, "вівторок", "Tuesday", "mardi"),
    WEDNESDAY(4, "середа", "Wednesday", "ttt"),
    THURSDAY(5, "четвер", "Thursday", "ooo"),
    FRIDAY(6, "п’ятниця", "Friday", "gggg"),
    SATURDAY(7, "субота", "Saturday", "ff");


    private int numberOfWeek;
    private String ua;
    private String en;
    private String fr;

    DaysOfWeek() {
    }

    DaysOfWeek(int numberOfWeek, String ua, String en, String fr) {
        this.numberOfWeek = numberOfWeek;
        this.ua = ua;
        this.en = en;
        this.fr = fr;
    }

    public int getNumberOfWeek() {
        return numberOfWeek;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }

    public String getFr() {
        return fr;
    }

    @Override
    public String toString() {
        return "numberOfWeek: " + numberOfWeek +
                ", ua: '" + ua + '\'' +
                ", en: '" + en + '\'' +
                ", fr: '" + fr + '\'' +
                '}';
    }

    public static void showNamesOfDay() throws IOException {
        System.out.println("please write number of day");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        switch (i) {
            case 1:
                System.out.println(SUNDAY.toString());
                break;
            case 2:
                System.out.println(MONDAY.toString());
                break;
            case 3:
                System.out.println(TUESDAY.toString());
                break;
            case 4:
                System.out.println(WEDNESDAY.toString());
                break;
            case 5:
                System.out.println(THURSDAY);
                break;
            case 6:
                System.out.println(FRIDAY.toString());
                break;
            case 7:
                System.out.println(SATURDAY.toString());
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        showNamesOfDay();
    }
}
