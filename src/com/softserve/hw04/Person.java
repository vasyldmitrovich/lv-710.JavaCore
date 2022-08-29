package com.softserve.hw04;

import lombok.*;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Person {
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    private int birthYear;


    public void input() {
        System.out.println("Enter person Name or FirstName and LastName:");
        String nameElements = ConsoleHelper.getDataFromConsole();
        changeName(nameElements.split(" "));

        System.out.println("Enter year of birth:");
        try {
            int birthdayYear = Integer.parseInt(ConsoleHelper.getDataFromConsole());
            if (birthdayYear > 0)
                birthYear = birthdayYear;
        } catch (NumberFormatException ignore) {
            System.out.println("denied");
        }

    }

    public void output() {
        System.out.println(this);
        System.out.println("Age " + firstName + " - " + getAge());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }

    public int getAge() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(formatter.format(new Date()));
        if (birthYear > 0)
            return currentYear - birthYear;
        return 0;
    }

//    @Deprecated
//    public int getAge() {
//        if (birthYear > 0)
//            return 1900 + new Date().getYear() - birthYear;
//        return 0;
//    }

    public void changeName(String... nameElements) {
        int length = nameElements.length;
        if (length > 1)
            lastName = nameElements[1];
        if (length > 0)
            firstName = nameElements[0];
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Person person = new Person();
            person.input();
            persons.add(person);
        }
        System.out.println();
        persons.forEach(Person::output);
    }

    private static class ConsoleHelper {
        private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        @SneakyThrows
        private static String getDataFromConsole() {
            return reader.readLine();
        }
    }
}
