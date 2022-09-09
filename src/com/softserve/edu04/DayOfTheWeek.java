package com.softserve.edu04;

public enum DayOfTheWeek {
    MONDAY(1, "Понеділок", "Monday", "Lunas"),
    TUESDAY(2, "Вівторок", "Tuesday", "Martes"),
    WEDNESDAY(3, "Середа", "Wednesday", "Miercoles"),
    THURSDAY(4, "Четвер", "Thursday", "Jueves"),
    FRIDAY(5, "Пятниця", "Friday", "Viernes"),
    SATURDAY(6, "Субота", "Saturday", "Con"),
    SUNDAY(7, "Неділя", "Sunday", "Domingo");

    private int dayOfTheWeekNumber;
    private String ua;
    private String en;
    private String es;

    DayOfTheWeek(int dayOfTheWeekNumber, String ua, String en, String es) {
        this.dayOfTheWeekNumber = dayOfTheWeekNumber;
        this.ua = ua;
        this.en = en;
        this.es = es;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }

    public String getEs() {
        return es;
    }


    //TODO move following code  from that class to another, for example in Main class
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
