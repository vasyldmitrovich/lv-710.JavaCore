package com.softserve.edu04.Logic;

import com.softserve.edu04.IO.In;
import com.softserve.edu04.IO.Input;
import com.softserve.edu04.IO.Out;
import com.softserve.edu04.IO.Output;

public class Task2 {
    public static void run() {
        In myIn = new Input();
        Out myOut = new Output();
        int dayNumber;
        dayNumber = myIn.readInt("Enter the number of the day of the week: ");
        //myIn.close();
        myOut.print("En ", "It's ", DayOfWeek.values()[dayNumber - 1].getEn());
        myOut.print("Ua ", "Це ", DayOfWeek.values()[dayNumber - 1].getUa());
        myOut.print("Ro ", "Este ", DayOfWeek.values()[dayNumber - 1].getRo());

        System.out.println();
        System.out.println("Other realisation");
        System.out.println();

        for (Enum<?> val : DayOfWeekLocalization.values()) {
            myOut.print(DayOfWeekLocalization.values()[val.ordinal()].toString(), " ",
                    DayOfWeekLocalization.values()[val.ordinal()].getDays()[dayNumber - 1]);
        }
    }
}
