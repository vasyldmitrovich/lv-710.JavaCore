package com.softserve.hw05;

import java.util.Scanner;

public class Integers {
    Scanner sc2 = new Scanner(System.in);
    int sum1 = 0;
    int k;
    int count =0;
    int product =1;

    public void input(){
    for (int i = 0; i < 5; i++) {
        System.out.println("Input number");
        k = sc2.nextInt();
        if (k>0){
            sum1 += k;
            count += 1;
        }
        else
            continue;

    }
    for (int i = 0; i < 5; i++) {
        System.out.println("Input number");
        k = sc2.nextInt();
        if (count !=5){
            product = product*k;
        }
        else
            continue;

    }
    if (count ==5)
            System.out.println("Sum = "+ sum1);
    else
            System.out.println("Product = " + product);
    }
}
