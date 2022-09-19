package com.softserve.edu15.Tasks;

public class Task13 {
    public static void run(){
        int i=1;
        do{
            i++;
        }while(!((i%8==0)&&(i%9==0)&&(i%11==0)&&(i%13==0)&&(i%14==0)&&(i%15==0)&&(i%16==0)&&(i%17==0)&&(i%18==0)&&(i%19==0)&&(i%20==0)));
        System.out.println(i);
    }
}
