package com.softserve.edu04.Logic;


import com.softserve.edu04.IO.In;
import com.softserve.edu04.IO.Input;
import com.softserve.edu04.IO.Out;
import com.softserve.edu04.IO.Output;

import java.util.ArrayList;

public class Task1 {

    public static void run() {
        In myIn = new Input();
        Out myOut = new Output();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(myIn.readInt("Enter digit: "));
        arr.add(myIn.readInt("Enter digit: "));
        arr.add(myIn.readInt("Enter digit: "));
        //myIn.close();
        int oddCount = 0;
        for (int value : arr) {
            if (value % 2 != 0) oddCount++;
        }
        myOut.print("Count of odd: ", Integer.toString(oddCount));
    }
}
