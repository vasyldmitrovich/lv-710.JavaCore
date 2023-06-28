package com.softserve.edu10Regex.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoreSpaces {
    public static void main(String[] args) {
       removeRedundantSpaces("The  Ukrainian    people  is so      much   strong");
    }
    public static void removeRedundantSpaces(String str) {
        String modString = null;
        Pattern stringPattern = Pattern.compile("\\s+\\b");
        Matcher matcher = stringPattern.matcher(str);
        while (matcher.find()) {
            modString = str.replaceAll("\\s+\\b", " ");
        }
        System.out.print("string before changes: ");
        System.out.println(str);
        System.out.print("string after changes: ");
        System.out.println(modString);
        }
    }
