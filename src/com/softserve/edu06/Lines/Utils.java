package com.softserve.edu06.Lines;

import java.util.ArrayList;

public class Utils {
    public static void run() {
        ArrayList<Line> lines = new ArrayList<>();
        lines.add(new Line(new Point(1, 1), new Point(3, 2)));
        lines.add(new ColorLine(new Point(1, 7), new Point(3.5, -2.4), "red"));
        lines.add(new ColorLine(new Point(9, 4), new Point(5, -4.6), "black"));
        lines.add(new Line(new Point(1, 3), new Point(3, 9)));
        lines.add(new Line(new Point(1.8, 3.1), new Point(6.3, 2.8)));
        for (Line line : lines) line.print();
    }
}
