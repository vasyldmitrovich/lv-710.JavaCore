package com.softserve.hw04;

public class MainFirstTask {

    public static void main(String[] args) {

        Calculations calculations = new Calculations();

        // Float value belongs to the range [-5;5]
        calculations.range(6.2f, 3.3f, - 6.2f);

        //Maximum integer value
        calculations.maxInt(2, 3, 4, 6, 1, 6, 9);
    }
}
