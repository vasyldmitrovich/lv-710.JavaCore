package com.softserve.edu11Exceptions.ReadNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadNumber {
    public static void iterNumber(int k) throws IOException, NumberOutOfBoardsException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i;
        int j = 1;
        for (i = 0; i < k; i++) {
            arrayList.add(i, readNumber(1, 100));
            System.out.printf("arrayList after %d input number -> ", i + 1);
            System.out.println(arrayList.toString());
            if (arrayList.get(i) <= j) {
                throw (new NumberOutOfBoardsException("The current value is less than the previous one"));
            } else {
                j = arrayList.get(i);
            }
        }
    }

    public static int readNumber(int start, int end) throws IOException, NumberOutOfBoardsException {
        int number = returnInputInteger("Please input number");
        if (start < number && number < end) {
            System.out.println("Input number: " + number + " is valid");
        } else {
            throw (new NumberOutOfBoardsException("You have entered a number that falls outside the specified ranges "));
        }
        return number;
    }

    public static Integer returnInputInteger(String s) throws IOException {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer result = 0;
        try {
            result = Integer.valueOf((br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("You input wrong data, you need to enter digital values");
            System.exit(2);
        }
        return result;
    }
}
