package com.softserve.edu15.Tasks;

import com.softserve.edu15.IO.In;
import com.softserve.edu15.IO.Input;

import java.util.Random;

public class Task9 {
    public static void run(){
        int countOne=0;
        In myIn = new Input();
        int n=myIn.readInt("Enter n: ");
        for (int i=1;i<=n;i++){
            int rand=randomZeroOne();
            System.out.println(rand);
            if (rand==1) countOne++;
        }
        System.out.println();
        System.out.println("Count of 1: "+countOne);

    }
    private static int randomZeroOne(){
        if (new Random().nextInt()%2==0) return 0;
        else return 1;
    }
}
