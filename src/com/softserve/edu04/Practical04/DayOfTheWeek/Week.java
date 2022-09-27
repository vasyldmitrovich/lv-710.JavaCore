package com.softserve.edu04.Practical04.DayOfTheWeek;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Week {
    private int day;

    public Week() {

    }
    public Week(int day) {
        this.day=day;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day=day;
    }
    public int inputInt() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inInt = 0;
        try {
            inInt = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Not valid data. Please, input integer number.");
        }
        return inInt;
    }
    public String inDay(int day) {
        String weekDay;
        String error = "This day of the week does not exist ";
        switch (day) {
            case 1:
                weekDay = "The day of the week is: Monday, Ïîíåä³ëîê, Ïîíåäåëüíèê.";
                return weekDay;
            case 2:
                weekDay = "The day of the week is: Tuesday, Â³âòîðîê, Âòîðíèê.";
                return weekDay;

            case 3:
                weekDay = "The day of the week is: Wednesday, Ñåðåäà, Ñðåäà.";
                return weekDay;

            case 4:
                weekDay = "The day of the week is: Thursday, ×åòâåð, ×åòâåðã.";
                return weekDay;

            case 5:
                weekDay = "The day of the week is: Friday, Ï'ÿòíèöÿ, Ïÿòíèöà.";
                return weekDay;

            case 6:
                weekDay = "The day of the week is: Saturday, Ñóáîòà, Ñóááîòà.";
                return weekDay;

            case 7:
                weekDay = "The day of the week is: Sunday, Íåä³ëÿ, Íåäåëÿ.";
                return weekDay;

            default:
                return error;

        }

        }

} ;
