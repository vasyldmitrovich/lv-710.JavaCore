package com.softserve.edu15.Tasks;

import java.util.ArrayList;

public class Task12 {
    public static void run(){
        ArrayList<Integer> numArr=new ArrayList<>();
        for (int i=3; i<=1000;i++){
            if (i%3==0) {
                numArr.add(i);
                continue;
            }
            if (i%5==0) numArr.add(i);
        }
        int sum=0;
        for (int i:numArr) sum+=i;
        System.out.println("Sum = "+sum);
    }
}
