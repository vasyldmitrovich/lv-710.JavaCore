package com.softserve.IO;

import java.util.Scanner;

public class Input {

    public static int inputInt(String errorMessage){
        int result;
        Scanner input = new Scanner(System.in);
        while (true){
            try { result = Integer.parseInt(input.nextLine());
                break;
            }catch (NumberFormatException e){
                System.err.println(errorMessage);
            }
        }
        return result;
    }

}
