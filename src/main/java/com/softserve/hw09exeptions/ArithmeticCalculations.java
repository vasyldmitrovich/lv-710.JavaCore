package com.softserve.hw09exeptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArithmeticCalculations {

    public double div(double value1, double value2) {
        if (value2 == 0) throw new ArithmeticException();
        return value1 / value2;
    }

    public void readNumber(int start, int end) throws NumberFormatException, IndexOutOfBoundsException {
        int number;

        for (String variable : mainM()) {
            try {
                number = Integer.parseInt(variable);
                if (number < start | number > end) {
                    throw new IndexOutOfBoundsException();
                } else {
                    System.out.printf("Number = %d, Range: [%d, %d]%n", number, start, end);
                }
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String> mainM() throws NumberFormatException, IndexOutOfBoundsException {
        List<String> listOfVar = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            System.out.println("Input number...");
            listOfVar.add(new Scanner(System.in).nextLine());
        }
        return listOfVar;
    }
}