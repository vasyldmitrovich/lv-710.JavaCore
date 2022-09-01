package com.softserve.edu04.Logic;

public enum DayOfWeekLocalization {
    EN("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"),
    UA("Понеділок","Вівторок","Середа","Четвер","Пятниця","Субота","Неділя"),
    RO("Luni","Marți","Miercuri","Joi","Vinery","Sâmbătă","Duminică");
    private final String[] days;
//    DayOfWeekLocalization(String mon, String tue, String wed, String thu, String fri, String sat, String sun) {
//        this.days= new String[]{mon, tue, wed, thu,fri,sat,sun};
//    }
    DayOfWeekLocalization(String... days){
        this.days = days;
    }

    public String[] getDays() {
        return days;
    }
}
