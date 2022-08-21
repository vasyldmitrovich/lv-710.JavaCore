package bio;

import main.Main;

public class Bio {
    public static void getBio() {
        System.out.print("What is your name? ");
        String usrName = Main.readInputString();
        String capName = capitalizeWord(usrName);
        System.out.print("Where are you living, " + capName + "? ");
        String usrLoc = Main.readInputString();
        String capLoc = capitalizeWord(usrLoc);
        System.out.println("Your name is " + capName +
                ".\nAnd your location is " + capLoc + ".\n");
    }

    private static String capitalizeWord(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
