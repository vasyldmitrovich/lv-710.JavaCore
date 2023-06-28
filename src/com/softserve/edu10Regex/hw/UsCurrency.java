package com.softserve.edu10Regex.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrency {
    public static void main(String[] args) {
        findUsCurrency("The task requires implementation of a pattern to match US currency format, which includes a\n" +
                "dollar sign ($) followed by any number of digits, $24356...5467, a dot, and two digits after the dot. The next step\n" +
                "is to input a text containing several instances of US currency format via the$656....35999994console. Finally,\n" +
                "display all the occurrences of US $6576..354 currency format on the console screen.");
    }
    public static void findUsCurrency(String str) {
        System.out.println("All matches: ");
        Pattern stringPattern = Pattern.compile("\\$(\\d+)(\\.+\\d+)");
        Matcher matcher = stringPattern.matcher(str);
        while (matcher.find()) {
           String modString = str.substring(matcher.start(), matcher.end());
           String readyString = String.format(("%.2f"), Double.parseDouble
                    (((modString.replace("$", "")
                            .replace("..", ".")
                            .replace("..", ".")))));

            System.out.println("$" + readyString);
        }
    }
}

