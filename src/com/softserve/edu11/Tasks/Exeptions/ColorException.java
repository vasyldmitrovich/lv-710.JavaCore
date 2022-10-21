package com.softserve.edu11.Tasks.Exeptions;

import com.softserve.edu11.Tasks.Entity.Color;

import java.util.ArrayList;

public class ColorException extends Exception {
    private static final ArrayList<Color> possibleColor = new ArrayList<>();
    static {
        possibleColor.add(Color.BLUE);
        possibleColor.add(Color.RED);
    }
    public ColorException(String message) {
        super(message);
    }
    public static void isPossible(Color color) throws ColorException {
        if (!possibleColor.contains(color)){
            throw new ColorException(color.name() + " not allowed!");
        }
    }
}
