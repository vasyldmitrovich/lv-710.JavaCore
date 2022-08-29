package com.softserve.hw03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static BufferedReader bf =
            new BufferedReader(new InputStreamReader(System.in));

    public static String getInputString() throws IOException {
        try {
            String s = bf.readLine();
            return s;
        } catch (IOException e) {
            System.out.println("wrong data");
            return getInputString();
        }
    }

    public static int getInputInt() throws IOException {
        try {
            int i = Integer.parseInt(bf.readLine());
            return i;

        } catch (NumberFormatException e) {
            System.out.println("wrong data");
            return getInputInt();
        }
    }

    public static void main(String[] args) throws IOException {

        List<Person> prsn = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            prsn.add(i, new Person());
            System.out.println("Set data for person " + (i + 1));
            prsn.get(i).input();
        }

        prsn.forEach(Person::output);

        prsn.get(1).changeName("Ivan", "Ivanov");
        prsn.get(1).setBirthYear(1982);
        prsn.get(2).changeName();

        prsn.forEach(Person::output);
    }
}
