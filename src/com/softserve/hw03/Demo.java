package com.softserve.hw03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void changeName(Person person) throws IOException {
        System.out.print("\nDo you want to change first (1) or last (2) name? (enter 1 or 2): ");
        int input = InputReader.getInputInt();
        String strInput;
        switch (input) {
            case 1: {
                System.out.print("Enter first name: ");
                strInput = InputReader.getInputString();
                person.changeName(strInput, person.getLastName());
                break;
            }
            case 2: {
                System.out.print("Enter last name: ");
                strInput = InputReader.getInputString();
                person.changeName(person.getFirstName(), strInput);
                break;
            }
            default: System.out.println("\nwrong input");
        }
    }

    public static void demonstration() throws IOException {
        List<Person> prsn = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            prsn.add(i, new Person());
            System.out.println("Set data for person " + (i + 1));
            prsn.get(i).input();
        }

        prsn.forEach(Person::output);

        prsn.get(1).changeName("Ivan", "Ivanov");
        prsn.get(1).setBirthYear(1982);

        changeName(prsn.get(2));

        prsn.forEach(Person::output);
    }

}
