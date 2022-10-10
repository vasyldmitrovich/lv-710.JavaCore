package com.softserve.edu10.Tasks;

import com.softserve.edu15.IO.In;
import com.softserve.edu15.IO.Input;

public class Task1 {
    public static void run() {
        In myIn = new Input();
        String s1 = myIn.readString("Enter first string: ");
        String s2 = myIn.readString("Enter first second: ");
        System.out.println("Second " + ((s2.contains(s1)) ? "" : "doesn't ") + "contain first string");
    }
}
