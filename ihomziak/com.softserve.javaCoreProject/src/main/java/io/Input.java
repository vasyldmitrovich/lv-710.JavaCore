package io;

import popup.Popup;

import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);
    Popup popup = new Popup();

    public int inputInt() {
        popup.circlePopup();
        return sc.nextInt();
    }

    public String inputString() {
        return sc.nextLine();
    }
}
