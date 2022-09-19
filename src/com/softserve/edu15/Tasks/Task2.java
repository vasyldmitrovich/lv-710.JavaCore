package com.softserve.edu15.Tasks;

import com.softserve.edu15.IO.In;
import com.softserve.edu15.IO.Input;

import java.util.ArrayList;

public class Task2 {
    public static void run() {
        In myIn = new Input();
        ArrayList<Integer> digits = new ArrayList();
        int number = myIn.readInt("Enter number up to 10000: ");


        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                digits.add(i);
                number = number / i;
            }
        }
        if (number > 2) {
            digits.add(number);
        }

        ArrayList<String> result = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < digits.size(); i++) {
            if ((i != digits.size() - 1) && (digits.get(i).equals(digits.get(i + 1)))) {
                count++;
                continue;
            }
            if (count > 1) {
                result.add(digits.get(i) + "^" + count);
                count = 1;
            } else
                result.add(Integer.toString(digits.get(i)));
        }
        System.out.println(result);
    }
}
