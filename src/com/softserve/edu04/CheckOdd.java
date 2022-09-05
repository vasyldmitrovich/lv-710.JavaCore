package com.softserve.edu04;

import com.softserve.hw03.InputReader;
import java.io.IOException;

public class CheckOdd {
    private int[] odd = new int[3];
    private int counter = 0;

    CheckOdd() {
    }

    public int[] getOdd() {
        return odd;
    }

    public void setOdd(int[] odd) {
        this.odd = odd;
    }

    public void checkOdd() throws IOException {
        System.out.print("Enter first number: ");
        odd[0] = InputReader.getInputInt();
        System.out.print("Enter second number: ");
        odd[1] = InputReader.getInputInt();
        System.out.print("Enter third number: ");
        odd[2] = InputReader.getInputInt();

        for (int i = 0; i < odd.length; i++) {
            if (odd[i] % 2 == 0)
                System.out.println(odd[i] + " is even;");
            else {
                System.out.println(odd[i] + " is odd;");
                counter++;
            }
        }

        System.out.println(counter + " of 3 numbers is are odd.");
    }
}
