package com.softserve.edu06.practical_tasks.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;


public class Gui extends JFrame {
    private String nameFrame;
    private int sizeFieldX;
    private int sizeFieldY;
    private final Line[] lines;

    private Gui(String nameFrame, int sizeField, Line... lines) {
        this.nameFrame = nameFrame;
        this.sizeFieldX = this.sizeFieldY = sizeField;
        this.lines = lines;
        setTitle(nameFrame);
        setSize(sizeFieldX, sizeFieldY);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void display(String nameFrame, int sizeField, Line... lines) {
        //create field
        new Gui(nameFrame, sizeField, lines);
    }

    //draw lines
    public void paint(Graphics graphics) {
        Arrays.stream(lines)
                .forEach(line -> line.print(graphics));
    }

}
