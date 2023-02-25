package com.softserve.edu05.hw.Cars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyRealisationInterface implements MyInterface{

    @Override
    public void runMyApp(String s) {
        System.out.println("s = " + s);
        Car car1 = new Car(showMessageAndReturnInputData("Input name of car"),
                Integer.parseInt(showMessageAndReturnInputData("Input name of car")),
                Double.parseDouble(showMessageAndReturnInputData("Input name of car")));



    }

    public String showMessageAndReturnInputData(String s) {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }
}
