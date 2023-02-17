package com.softserve.edu04.hm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// READY !!
public class FloatNumbers {

public  static void checkFloatNumbers() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    float f1 = Float.parseFloat(br.readLine());
    float f2 = Float.parseFloat(br.readLine());
    float f3 = Float.parseFloat(br.readLine());

    Float[] numbers = new Float[]{f1, f2, f3};
    {
        for (Float number :
                numbers) {
            String s = number >= -5 && number <= 5 ? " number satisfies the condition" : " number does not satisfy the condition";

            System.out.println(number + s);
        }
    }
}
    public static void main(String[] args) throws IOException {
        checkFloatNumbers();
    }


}