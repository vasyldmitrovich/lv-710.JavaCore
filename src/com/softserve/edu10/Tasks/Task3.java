package com.softserve.edu10.Tasks;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void run() {
        In myIn = new Input();
        for (int i = 0; i < 5; i++) {
            System.out.println(validateName(myIn.readString("Enter name: ")));
        }
    }

    private static String validateName(String name) {
        Pattern p = Pattern.compile("^(?=.{3,15}$)[a-zA-Z0-9_]+");
        Matcher m = p.matcher(name);
        return (m.matches()) ? "valid" : "not valid";
    }
}
