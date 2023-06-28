package com.softserve.edu01Introduction.practik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question {
    public static void main(String[] args) throws IOException {
        question(new BufferedReader(new InputStreamReader(System.in)));
    }
    public static void question(BufferedReader br) throws IOException {
        System.out.println("How are you?");
        String answer = br.readLine();
        System.out.println("You are " + answer);
    }
}
