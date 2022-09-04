package com.softserve.hw04;

import java.util.Scanner;

public class FloatNumbers {

    private float[] numbers;

    public FloatNumbers(){

    }

    public FloatNumbers(float[] numbers){
        this.numbers = numbers;
    }

    public void setNumbers(){
        System.out.println("Please enter " + numbers.length + " numbers");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < this.numbers.length; i++){
            while (true){
                try {
                    this.numbers[i] = Float.parseFloat(input.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.out.println("You need to enter a number, for example 3 or 7.8");
                }
            }
        }
    }

    public void checkNumbers (){
        for (int i = 0; i < this.numbers.length; i++){
            if (numbers[i] > -5 && numbers[i] < 5){
                System.out.println("Number " + numbers[i] + " belong to the range [-5,5]");
            } else {
                System.out.println("Number " + numbers[i] + " doesn't belong to the range [-5,5]");
            }
        }
    }
}
