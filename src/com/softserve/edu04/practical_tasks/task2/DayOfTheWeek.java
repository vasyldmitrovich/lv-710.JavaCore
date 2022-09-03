package com.softserve.edu04.practical_tasks.task2;


public enum DayOfTheWeek {
    MONDAY("Понеділок", "Monday", "der Montag"),
    TUESDAY("Вівторок", "Tuesday", "der Dienstag"),
    WEDNESDAY("Середа", "Wednesday", "der Mittwoch"),
    THURSDAY("Четвер", "Thursday", "der Donnerstag"),
    FRIDAY("П'ятниця", "Friday", "der Freitag"),
    SATURDAY("Субота", "Saturday", "der Samstag"),
    SUNDAY("Неділя", "Sunday", "der Sonntag");


    private final String UA;
    private final String EN;
    private final String GE;

    DayOfTheWeek(String UA, String EN, String GE) {
        this.UA = UA;
        this.EN = EN;
        this.GE = GE;
    }

    @Override
    public String toString() {
        return "UA - " + UA + " \\ " + "EN - " + EN + " \\ " + "GE - " + GE;
    }
}
