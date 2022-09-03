package com.softserve.edu04;

// Task 1. Enter three numbers. Find out how many of them are odd.

import java.util.Scanner;

public class Numbers {
    private int[] numbers;
    private static final Scanner input = new Scanner(System.in);

    public Numbers() {

    }

    public Numbers(int[] numbers){
        this.numbers = numbers;
    }

    public void setNumbers (){
        System.out.println("Please, enter three numbers");
        for (int i = 0; i < this.numbers.length; i++){
            while (true){
                try {
                    numbers[i] = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.out.println("You need to enter a number, 7 for example");
                }
            }
        }
    }


    public int getAmountOfNumbers() {
        return this.numbers.length;
    }

    public int countOddNumbers () {
        int counterOfOddNumbers = 0;
        for (int template : numbers){
            if (template % 2 != 0){
                counterOfOddNumbers++;
            }
        }
        return counterOfOddNumbers;
    }



}
