package edu05;

public class IntegerUtil {
    public static Integer findMaxNumber(Integer[] numbers) {
        Integer maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            Integer number = numbers[i];
            if (number > maxNumber) {
                maxNumber = number;
            }

        }

        return maxNumber;
    }
    public static Integer sumOfPositiveNumbers(Integer[] numbers) {
        int sumOfPositiveNumbers = 0;
        for (int i = 0; i < numbers.length; i++){
            Integer number = numbers[i];
          if (number > 0) {
              sumOfPositiveNumbers += number;

          }

        }
        return sumOfPositiveNumbers;
    }
    public static Integer sumOfNegativeNumbers(Integer[] numbers) {
        int sumOfPoNegativeNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            Integer number = numbers[i];
            if (number < 0) {
                sumOfPoNegativeNumbers += number;

            }

        }
        return sumOfPoNegativeNumbers;
    }
}
