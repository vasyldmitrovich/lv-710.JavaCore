package com.softserve.edu04.Logic;

import com.softserve.edu04.IO.In;
import com.softserve.edu04.IO.Input;
import com.softserve.edu04.IO.Out;
import com.softserve.edu04.IO.Output;

import java.util.Arrays;

public class Task3 {
    public static void run() {
        In myIn = new Input();
        Out myOut = new Output();
        String country;
        country = myIn.readString("Enter the name of the country: ");
        byte find = 0;
        for (Enum<?> val : Country.values()) {
            if (Arrays.asList(Country.values()[val.ordinal()].getCountries()).contains(country)) {
                myOut.print(country, " is located in ", Country.values()[val.ordinal()].getName());
                find++;
                //break;
            }
        }
        if (find == 0)
            myOut.print("Hmmm, I don't know where this country is located");
        else if (find > 1) System.out.println("It is transcontinental");
    }
}
