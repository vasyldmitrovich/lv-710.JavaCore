package com.softserve.edu04;

import com.softserve.hw04.Calculations;

public class Main {

    public static void main(String[] args) {

        Calculations calculations = new Calculations();
        Functionality functionality = new Functionality();

        // Find odd and Even numbers
        calculations.oddNumbers( 2, 6, 8, 3, 5);

        //Find continent were country is situated
        functionality.getCountry(functionality.stringToEnum());
    }
}
