package com.softserve.edu10Regex.hw;

public class StringFiveWords {
    public static void main(String[] args) {
        System.out.println(splitAndCheak("I like JavaCore so muuuuuuuch"));
    }
    public static String splitAndCheak(String str) {
        String[] words = str.split(" ");
        int size = 0;
        String s = " ";
        StringBuilder secondWord = new StringBuilder(words[2]);
        for (int i = 0; i< words.length; i++){
            System.out.println(words[i]);
            if (words[i].length() > size) {
                size = words[i].length();
                s = words[i];
            }
            secondWord.reverse();
        }
        System.out.println("Second Word after reverse: " + secondWord);
        System.out.println("Number letters of longest word: " + size);
        return "The longest word: " + s;
    }
}

