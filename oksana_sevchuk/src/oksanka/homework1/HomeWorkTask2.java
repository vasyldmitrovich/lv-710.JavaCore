package oksanka.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkTask2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader consoleReader = new BufferedReader(inputStreamReader);

        String messageParameter = "What is your name?";

        System.out.println(messageParameter);
        String lineOfText = consoleReader.readLine();
        String messageParameter2 = "Where are you live " + lineOfText + "?";
        System.out.println(messageParameter2);

        String lineOfAdress = consoleReader.readLine();
        String messageParameter3 = lineOfText + " lives on " + lineOfAdress;
        System.out.println(messageParameter3);

}}
