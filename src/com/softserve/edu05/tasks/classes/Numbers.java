package com.softserve.edu05.tasks.classes;

public class Numbers {
   private int[] numbers;

   public Numbers(){

   }

    public Numbers(int[] numbers){
       this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getBiggestNumber(){
       int template = numbers[0];
       for (int i = 1; i < numbers.length; i++){
           if (template < numbers[i]){
               template = numbers[i];
           }
       }
       return template;
    }

    public  int getSumOfPositiveNumbers(){
       int sum = 0;
       for (int template : numbers){
           if (template >= 0){
               sum += template;
           }
       }
       return sum;
    }

    public int getAmountOfNegativeNumbers(){
       int counter = 0;
        for (int template : numbers){
            if (template < 0){
                counter++;
            }
        }
        return counter;
    }

    public int getAmountOfPositiveNumbers(){
        int counter = 0;
        for (int template : numbers){
            if (template > 0)
                counter++;
        }
        return counter;
    }

    public String getBiggestGroupOfNumbers(){
       String result;
       if(getAmountOfPositiveNumbers() > getAmountOfNegativeNumbers()){
           result = "there are more positive numbers";
       } else if (getAmountOfPositiveNumbers() < getAmountOfNegativeNumbers()){
           result = "there are more negative numbers";
       } else if(getAmountOfNegativeNumbers() == getAmountOfPositiveNumbers()){
           result = "there are equally positive and negative numbers";
       } else {
           result = "something go wrong =(";
       }
       return result;
    }

}
