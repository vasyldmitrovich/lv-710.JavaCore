package edu05;

public class TaskRunner {
    public static void main(String[] args) {
        task1();
        task2();


    }

    public static void task1() {
        Integer[] numbers = new Integer[] {-3, -89, 78, 678, -9876, 95,234756, -245, 876, -34657};
        System.out.println("The bigest of these numbers is   " + IntegerUtil.findMaxNumber(numbers));
        System.out.println("Sum of positive numbers is  " + IntegerUtil.sumOfPositiveNumbers(numbers));
        System.out.println("Sum of positive negative is  " + IntegerUtil.sumOfNegativeNumbers(numbers));
    }
    public static void task2() {

    }
}
