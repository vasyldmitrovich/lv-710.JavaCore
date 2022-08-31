package com.softserve.hw04.person;

import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;

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



    public void output() {
        System.out.println(this);
        System.out.println("Age " + firstName + " - " + getAge());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }

    public void input() {
        System.out.println("Enter person Name or FirstName and LastName:");
        String nameElements = ConsoleHelper.getDataFromConsole();//Good decision
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

}
