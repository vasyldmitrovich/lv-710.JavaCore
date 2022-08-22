package com.company;

import java.util.Scanner;

public class Calculator1 {
    private static final Scanner input = new Scanner(System.in);
    String inputString, numberA, numberB;
    double a, b, result;
    char mathOperation;
    char[] inputStringArray;
    int indexOf;

    public Calculator1() {
        System.out.println("Please, enter a math operation: ");
        this.inputString = input.nextLine();
    }

    public String getInputString() {
        return this.inputString;
    }

    private char[] getInputStringArray() {
        this.inputStringArray = inputString.toCharArray();
        return inputStringArray;
    }

    private char setMathOperation() {
        for (char template : getInputStringArray()) {
            if (template == '+') {
                mathOperation = '+';
                indexOf = inputString.indexOf('+');
            } else if (template == '-') {
                mathOperation = '-';
                indexOf = inputString.indexOf('-');
            } else if (template == '*') {
                mathOperation = '*';
                indexOf = inputString.indexOf('*');
            } else if (template == '/') {
                mathOperation = '/';
                indexOf = inputString.indexOf('/');
            }
        }
        return mathOperation;
    }

    private void setOperators() {
        this.numberA = inputString.substring(0, indexOf);
        this.a = Double.parseDouble(this.numberA);
        this.numberB = inputString.substring(indexOf + 1);
        this.b = Double.parseDouble(this.numberB);
    }

    public void calculateResult() {
        getInputStringArray();
        setMathOperation();
        setOperators();
        if (setMathOperation() == '+') {
            this.result = this.a + this.b;
        } else if (setMathOperation() == '-') {
            this.result = this.a - this.b;
        } else if (setMathOperation() == '*') {
            this.result = this.a * this.b;
        } else if (setMathOperation() == '/') {
            this.result = this.a / this.b; }
        System.out.println(result);
    }
}