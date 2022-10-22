package com.softserve.hw10;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class StringRegEx {
    public void task() {
        //Task 1
        System.out.println("Enter a five words long sentence: ");
        Scanner sc = new Scanner(System.in);
        java.lang.String str = sc.nextLine();

        java.lang.String word = "";

        java.lang.String largestWord = "";
        java.lang.String[] words = new java.lang.String[100];

        int length = 0;
        if (str.charAt(str.length() - 1) == '.') {
            str = str.substring(0, str.length() - 1);
        }
        str = str + " ";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                words[length] = word;
                length++;
                word = "";
            }
        }

        largestWord = words[0];

        for (int k = 0; k < length; k++) {
            if (largestWord.length() < words[k].length())
                largestWord = words[k];
        }

        System.out.println("Largest word: " + largestWord);
        System.out.println("Largest word lenght: " + largestWord.length());

        StringBuilder sb = new StringBuilder(words[1]);
        //sb.reverse();
        System.out.println(sb.reverse().toString());

        //Task 2
        java.lang.String str1 = "I    am      learning     Java   Core";
        System.out.println(str1.replaceAll("\\s+", " "));

        //Task 3
        Scanner sc1 = new Scanner(System.in);
        double[] x = new double[5];
        for (int i = 0; i < x.length; i++) {
            System.out.println("Please enter a double: ");
            x[i] = sc1.nextDouble();
            Locale.setDefault(Locale.ENGLISH);
            System.out.println(new DecimalFormat("$ ### ###.##").format(x[i]));
            //System.out.println(x[i]);
        }
    }
}
