package com.softserve.FileAndException;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class FileTest {
    public static void main(String[] args)  {
        String separator = File.separator;
//        String pathName = separator + "Users" + separator + "sergejlunev" + separator + "Desktop" + separator + "Mantra";
        String pathName = "/Users/sergejlunev/Desktop/Test";
        File file = new File("pathName");
        File file2 = new File("Test");

        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }
        while (scanner1.hasNextLine()) {
            System.out.println(scanner1.nextLine());
        }
        scanner1.close();

        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(file2);
        } catch (FileNotFoundException e) {
            System.out.println("файл2 не найден");
        }
        String line = scanner2.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int count = 0;
        for (String number :
                numbersString) {
            numbers[count++] = Integer.parseInt(number);
            System.out.println(Arrays.toString(numbers));

            scanner2.close();
        }
    }
}