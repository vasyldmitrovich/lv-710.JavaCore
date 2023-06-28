package com.softserve.edu10Regex.practik;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FiveNames {
    public static void main(String[] args) {
        List<String> Names = new ArrayList<>(5);
        Names.add("I_");
        Names.add("435__Petro2342354600_HOT");
        Names.add("_MARIIIIA_4346");
        Names.add("Oooooooooooolia_3245");
        Names.add("Stas__56_SUPER");
        checkNames(Names);

    }
    public static void checkNames(List<String> nameArray) {
        for (String name:
             nameArray) {
            Pattern stringPattern = Pattern.compile("\\w{3,15}");
            Matcher matcher = stringPattern.matcher(name);
            if (matcher.matches()) {
                System.out.println("This name is suitable: " + name);
            } else {
                System.out.println("This name is NOT suitable: " + name);
            }
        }
    }
}
