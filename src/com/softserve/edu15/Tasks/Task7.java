package com.softserve.edu15.Tasks;

import com.softserve.edu15.IO.In;
import com.softserve.edu15.IO.Input;

public class Task7 {
    public static void run(){
        In myIn = new Input();
        int num = myIn.readInt("Enter number: ");
        String resultString=num+"!=1";
        int result=1;
        for (int i=2;i<num+1;i++){
            resultString+="*"+i;
            result*=i;
        }
        if(num>1)System.out.println(resultString+"="+result);
        else if (num==1)System.out.println("1!=1");
        else System.out.println("The number is not positive!");

    }
}
