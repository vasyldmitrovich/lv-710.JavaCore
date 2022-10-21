package com.softserve.hw05;

import java.util.Scanner;
//Task1
public class Months {

    int[] monthDays1 = {31,28,31,30,31,30,31,31,30,31,30,31};
    int p;

    public void daysCheck() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input the number of the month: ");
        p = sc1.nextInt();
        System.out.println(monthDays1[p - 1]);
    }


}
