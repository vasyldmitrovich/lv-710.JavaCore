package com.softserve.hw04;

import java.util.Scanner;

public class IntegerNumbers {

    private int[] numbers;


    public IntegerNumbers(int[] numbers){
        this.numbers = numbers;
    }

    public void setNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter " + numbers.length + " numbers");
        for (int i = 0; i < numbers.length; i++){
            while (true){
                try {
                    numbers[i] = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.out.println("You need to enter an integer, 3 or 56 for example");
                }
            }
        }
    }

    public int getMaxNumber(){
        int template = numbers[0];
        for (int i = 0; i < numbers.length; i++)
            if (template < numbers[i]) {
                template = numbers[i];
            }
        return template;
    }

    public int getMinNumber(){
        int template = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(template > numbers[i]){
                template = numbers[i];
            }
        }
        return template;
    }

    public void displayResult() {
        System.out.println("There are " + numbers.length + " numbers, the largest is " + getMaxNumber() +
                ", and the smallest is " + getMinNumber() + ".");
    }
}
