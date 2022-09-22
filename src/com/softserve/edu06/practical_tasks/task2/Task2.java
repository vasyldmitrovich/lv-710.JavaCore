package com.softserve.edu06.practical_tasks.task2;

import java.awt.*;

/**
 * Task 2. Create three classes:
 * Point with attributes x and y
 * Line which contains two object of Point class
 * ColorLine with attributes Color  which extends Line class.
 * Override method toString() and define method print() in every classes
 * In main() method create array of Line and add some Line and ColorLine to it. Call method print() for all of it.
 */

public class Task2 {
    public void run() {
        // Hi!
        Line[] lines = {
                //H
                new Line(new Point(100, 100), new Point(100, 350)),
                new Line(new Point(100, 200), new Point(200, 200)),
                new Line(new Point(200, 100), new Point(200, 350)),
                //i
                new ColorLine(new Point(250, 140), new Point(250, 160), Color.blue),
                new ColorLine(new Point(250, 140), new Point(270, 140), Color.blue),
                new ColorLine(new Point(270, 140), new Point(270, 160), Color.blue),
                new ColorLine(new Point(250, 160), new Point(270, 160), Color.blue),
                new ColorLine(new Point(260, 200), new Point(260, 350), Color.orange),
                //!
                new Line(new Point(320, 100), new Point(320, 290)),
                new Line(new Point(310, 330), new Point(310, 350)),
                new Line(new Point(330, 330), new Point(330, 350)),
                new Line(new Point(310, 330), new Point(330, 330)),
                new Line(new Point(310, 350), new Point(330, 350))
        };

        Gui.display("Task2", 480, lines);
    }
}
