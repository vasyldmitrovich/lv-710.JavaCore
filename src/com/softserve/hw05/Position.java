package com.softserve.hw05;

import java.util.Arrays;
import java.util.Scanner;

public class Position {
    
    public void postion() {

        int[] array = new int[5];
        int min = Integer.MAX_VALUE;
        int count = 0;
        int index = 0;
        int product = 1;
        int minInd = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter an integer: ");
            Scanner sc = new Scanner(System.in);
            array[i] = sc.nextInt();

            if (array[i]>0){
                count = count+1;
                if (count==2){
                    index=i;
                }
            }

            if(array[i]<min){
                min = array[i];
            }

            if (array[i]%2==0){
                product = product * array[i];
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Position of second positive number is "+ (index+1));
        System.out.println("The minimum element is: " + min + "\n" + "Its position: " + (Arrays.binarySearch(array, min) + 1));
        System.out.println("Product of the even numbers equals: " + product);
    }

}
