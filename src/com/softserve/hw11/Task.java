package com.softserve.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
    public void task() {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            double a;
            double b;

            System.out.println("Please enter a double number: ");
            a = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Please enter another double number: ");
            b = Double.parseDouble(bufferedReader.readLine());

            System.out.println(div(a, b));

            readNumber(1, 10);

            readNumber(readNumber(readNumber(readNumber(readNumber(readNumber(readNumber(readNumber(readNumber
                    (readNumber(1,100),100),100),100),100),100),100),100),100),100);

        }catch (IndexOutOfBoundsException | NumberFormatException | IOException exception){
            exception.printStackTrace();
        }
    }

    private double div(double a, double b){
        return a/b;
    }

    private int readNumber(int start, int end) throws IndexOutOfBoundsException, IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter an integer in a range "+start+'-'+end+": ");
        int input = Integer.parseInt(bufferedReader.readLine());

        if (input<start || input>end){
            throw new IndexOutOfBoundsException("The number you entered is out of the range");
        }
        return input;
    }
}


