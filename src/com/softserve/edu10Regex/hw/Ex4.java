package com.softserve.edu10Regex.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *  Create a console application that validates user input for their first and last name, ensuring that they only
 *  contain English letters, spaces, and hyphens. If the input data is incorrect, prompt the user to re-enter the data.
 *  Upon successful entry of the user's first and last names, generate a random greeting message that
 *  includes the user's name.
 *
 * To validate the user input, utilize String class methods, control loops, and regular expressions.
 * Generate the random greeting message (use printf() method for output) by creating an array of phrases that contain
 * various text options with the user's name inserted.
 */
public class Ex4 {
    public static void main(String[] args) {
        showMessageAndReturnInputData("Please write your name and surname\nDon't use a newline break");
    }

    public static String showMessageAndReturnInputData(String s) {
        System.out.println(s);
        String result = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            result = br.readLine();
            boolean isValid = result.matches("^[a-zA-Z-]+\\s+[a-zA-Z-]+$");
            if (!isValid) {
                System.out.println("You entered incorrect data");
                showMessageAndReturnInputData(s);
            } else {
                greeting(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }

    public static void greeting(String userName) {
        String[] greetings = {
                "Hello, %s! How are you?",
                "Hi there, %s! Hope you're having a great day!",
                "Greetings, %s! What are you up to?",
                "Hey, %s! Nice to see you!",
                "Good day, %s! How's everything going?"
        };
        Random random = new Random();
        int index = random.nextInt(greetings.length);
        String greeting = greetings[index];
        System.out.printf(greeting, userName);
    }
}