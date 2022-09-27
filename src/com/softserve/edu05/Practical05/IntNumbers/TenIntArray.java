package com.softserve.edu05.Practical05.IntNumbers;

public class TenIntArray {
    public static void main(String[] args) {
        Array array = new Array();
        int[] values = { -90, -19, -15, 13, 0, 6, -1, -7, 45, -35 };
        System.out.println("Maximum of numbers in the array is: " + array.maxArray(values));
        System.out.println("Minimum of numbers in the array is: " + array.minArray(values));
        System.out.println("The sum of positive numbers in the array is: " + array.sumPlus(values));
        System.out.println("The product of negative numbers in the array is: " + array.sumMinus(values));
        System.out.println("The amount of positive numbers in the array is: " + array.amountPlus(values));
        System.out.println("The amount of negative numbers in the array is: " + array.amountMinus(values));
        array.equalsAmount(values);
    }
}
