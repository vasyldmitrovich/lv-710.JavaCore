package com.softserve.hw10.Tasks;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void run() {
        In myIn = new Input();
        String text = myIn.readString("Enter the text that contains several occurrences of US currency: ");
        Pattern pattern = Pattern.compile("[$]\\d+?\\.\\d{2}\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
