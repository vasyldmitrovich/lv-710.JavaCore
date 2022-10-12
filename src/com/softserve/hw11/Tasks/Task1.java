package com.softserve.hw11.Tasks;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;

import java.io.IOException;

public class Task1 {
    static In myIn = new Input();

    public static void run(){
        try{
            double a = myIn.readDouble("Enter first double: ");
            double b = myIn.readDouble("Enter second double: ");
            System.out.println(div(a,b));
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
        try {
            // Thanks to Sergey Mudrachenko, I admire his implementation!!!
            readNumber(readNumber(readNumber(readNumber(readNumber(readNumber(readNumber(readNumber(
                    readNumber(readNumber(1, 100), 100), 100), 100), 100), 100), 100), 100), 100), 100);
        } catch (IndexOutOfBoundsException | IOException e) {
            e.printStackTrace();
        }

    }

    private static double div(double a, double b){
        return a/b;
    }

    private static int readNumber(int start, int end) throws IndexOutOfBoundsException, IOException {
        int result = myIn.readInt("Enter integer number in range ["+start+'-'+end+"]: ");
        if (result<start || result>end){
            throw new IndexOutOfBoundsException(String.format("%d - Out Of Bounds [%d-%d]", result, start, end));
        }
        return result;
    }
}
