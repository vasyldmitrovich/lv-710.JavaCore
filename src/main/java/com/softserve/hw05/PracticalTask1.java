package com.softserve.hw05;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticalTask1 {

    public static void main(String[] args) {

        int[] digits = {-3,-5, 4, 6, 9, -8, 0, 2, 1, -10};

        Calculations calc = new Calculations();
        calc.isPositiveOrNegativeInt(digits);

        calc.sumOfPositiveNumbers(digits);

        calc.amountOfNegativeNumbers(digits);

        calc.maxInt(digits);

        calc.moreNegativeOrPositive(digits);
    }
}
