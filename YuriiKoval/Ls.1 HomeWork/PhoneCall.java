package com.company;
import java.util.Scanner;

public class PhoneCall {
    double costPerMinute1, costPerMinute2, costPerMinute3;
    int time1, time2, time3;
    Scanner input = new Scanner(System.in);

    public void setCostPerMinute() {
        System.out.println("Please, enter the call price per minutes from first country");
        this.costPerMinute1 = input.nextDouble();
        System.out.println("Please, enter the call price per minutes from second country");
        this.costPerMinute2 = input.nextDouble();
        System.out.println("Please, enter the call price per minutes from third country");
        this.costPerMinute3 = input.nextDouble();
    }

    public void setTime(){
        System.out.println("Please, enter the call time in minutes from first country");
        this.time1 = input.nextInt();
        System.out.println("Please, enter the call time in minutes from second country");
        this.time2 = input.nextInt();
        System.out.println("Please, enter the call time in minutes from third country");
        this.time3 = input.nextInt();
    }

    public void calculatePriceOfCall(){
        System.out.println("The call price from first country is " + (time1 * costPerMinute1) + ", from second country is " +
                (time2 * costPerMinute2) + ", from third country is " + (time3 * costPerMinute3));
        System.out.println("The call price of all calls together is " + ((time1 * costPerMinute1) + (time2 * costPerMinute2) + (time3 * costPerMinute3)));
    }
}
