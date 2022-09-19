package com.softserve.edu15.Tasks;

import com.softserve.edu15.IO.In;
import com.softserve.edu15.IO.Input;

public class Task10 {
    public static void run(){
        In myIn = new Input();
        int num=myIn.readInt("Enter natural number: ");
        int count=0;
        while (num!=1){
            num=(num%2==0)?num/2:(num*3)+1;
            count++;
        }
        System.out.println("Count of iterations: "+count);

    }
}

