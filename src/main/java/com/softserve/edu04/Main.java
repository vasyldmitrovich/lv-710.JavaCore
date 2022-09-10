package com.softserve.edu04;

import com.softserve.hw04.Calculations;

public class Main {

    public static void main(String[] args) {

        //TODO Do not have Practical tasks 2, 3, 4, tasks
        Calculations calculations = new Calculations();
        Functionality functionality = new Functionality();

        // Find odd and Even numbers
        calculations.oddNumbers( 2, 6, 8, 3, 5);

        //Find continent were country is situated
        functionality.getCountry(functionality.stringToEnum());
    }
}
