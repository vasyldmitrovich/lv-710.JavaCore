package com.softserve.edu10.Tasks;

import com.softserve.edu04.IO.*;

public class Task2 {
    public static void run() {
        In myIn = new Input();
        String fullName = myIn.readString("Enter surname, name and patronymic: ").trim();
        try {
            String surname = fullName.substring(0, fullName.indexOf(' '));
            String name = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
            String patronymic = fullName.substring(fullName.lastIndexOf(' ') + 1);
            System.out.println(surname + ' ' + name.charAt(1) + '.' + patronymic.charAt(1) + '.');
            System.out.println(name);
            System.out.println(name + ' ' + patronymic + ' ' + surname);
        } catch (Exception e) {
            System.out.println("Something wrong");
        }

    }
}
