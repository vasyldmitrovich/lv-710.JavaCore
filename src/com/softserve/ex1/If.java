package com.softserve.ex1;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("введите число");
        int numb = Integer.parseInt(args[0]);

        if (numb % 2 != 0) {
            System.out.println(args[0]);
        }
        else {
            System.out.println("упс");
        }

    }
}