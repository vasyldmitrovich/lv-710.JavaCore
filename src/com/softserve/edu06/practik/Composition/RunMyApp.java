package com.softserve.edu06.practik.Composition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunMyApp {
    public static String showMessageAndReturnInputData(String s) {
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

    public static void createAndPrintLines() {
        Line[] lines = new Line[4];
        lines[0] = new Line(new Point(Integer.parseInt(showMessageAndReturnInputData("print x")), Integer.parseInt(showMessageAndReturnInputData("print y"))),
                new Point(Integer.parseInt(showMessageAndReturnInputData("print x")), Integer.parseInt(showMessageAndReturnInputData("print y"))));
        lines[1] = new Line(new Point(Integer.parseInt(showMessageAndReturnInputData("print x")), Integer.parseInt(showMessageAndReturnInputData("print y"))),
                new Point(Integer.parseInt(showMessageAndReturnInputData("print x")), Integer.parseInt(showMessageAndReturnInputData("print y"))));
        lines[2] = new ColorLine(new Point(Integer.parseInt(showMessageAndReturnInputData("print x")), Integer.parseInt(showMessageAndReturnInputData("print y"))),
                new Point(Integer.parseInt(showMessageAndReturnInputData("print x")), Integer.parseInt(showMessageAndReturnInputData("print y"))),
                showMessageAndReturnInputData("print color"));
        lines[3] = new ColorLine(new Point(Integer.parseInt(showMessageAndReturnInputData("print x")), Integer.parseInt(showMessageAndReturnInputData("print y"))),
                new Point(Integer.parseInt(showMessageAndReturnInputData("print x")), Integer.parseInt(showMessageAndReturnInputData("print y"))),
                showMessageAndReturnInputData("print color"));
        for (Line line :
                lines) {
            line.print();
            System.out.println(line.toString());
        }
    }
}

