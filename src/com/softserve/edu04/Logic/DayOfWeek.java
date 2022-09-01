package com.softserve.edu04.Logic;

public enum DayOfWeek {
    // P.S. I know that in English the week starts from Sunday, but we are Ukrainians ))),
    MONDAY("Понеділок","Monday","Luni"),
    TUESDAY("Вівторок","Tuesday", "Marți"),
    WEDNESDAY("Середа", "Wednesday", "Miercuri"),
    THURSDAY("Четвер", "Thursday", "Joi"),
    FRIDAY("Пятниця", "Friday", "Vinery"),
    SATURDAY("Субота", "Saturday", "Sâmbătă"),
    SUNDAY("Неділя", "Sunday", "Duminică");
    private final String ua;
    private final String en;
    private final String ro;

    DayOfWeek(String ua, String en, String ro) {
        this.ua = ua;
        this.en = en;
        this.ro= ro;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }

    public String getRo() {
        return ro;
    }
}