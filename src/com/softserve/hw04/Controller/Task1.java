package com.softserve.hw04.Controller;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;
import com.softserve.hw04.IO.Out;
import com.softserve.hw04.IO.Output;

public class Task1 {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void run() {
        In myIn = new Input();
        Out myOut = new Output();

        boolean allInRange = true;
        for (int i = 0; i < 3; i++) {
            double temp = myIn.readDouble("Enter number: ");
            if ((temp <= -5) || (temp >= 5)) allInRange = false;
        }
        if (allInRange) System.out.println("All in range");
        else System.out.println("Not in range");

        addWithCheck();
        addWithCheck();
        addWithCheck();
        System.out.println("min = " + min + ", max = " + max);

        int HTTPErr = myIn.readInt("Enter HTTP Error code(400-417): ");
        myOut.print("Status code: ", HTTPError.getStatusCode(HTTPErr));
    }

    private static void addWithCheck() {
        In myIn = new Input();
        int temp = myIn.readInt("Enter number: ");
        if (temp > max) max = temp;
        if (temp < min) min = temp;
    }
}
