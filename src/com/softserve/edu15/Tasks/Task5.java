package com.softserve.edu15.Tasks;

import com.softserve.edu15.IO.In;
import com.softserve.edu15.IO.Input;

public class Task5 {
    public static void run(){
        In myIn=new Input();
        String text = myIn.readString("Enter text: ");
        if (isPalindrome(text)) System.out.println("String is palindrome ");
        else System.out.println("String is not palindrome ");
    }
    static boolean isPalindrome(String text){
        if (text.length()%2!=0) return false;
        boolean result=true;
        for (int i = 0; i < text.length()/2; i++) {
            if (text.charAt(i)!=text.charAt(text.length()-i-1)){
                result=false;
                break;
            }
        }
        return result;
    }
}
