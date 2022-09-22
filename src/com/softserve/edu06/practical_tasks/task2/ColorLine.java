package com.softserve.edu06.practical_tasks.task2;


import java.awt.*;
import java.util.Objects;

public class ColorLine extends Line {
    private Color color = Color.lightGray;

    public ColorLine() {
    }

    public ColorLine(Point point1, Point point2, Color color) {
        super(point1, point2);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColorLine colorLine = (ColorLine) o;
        return Objects.equals(color, colorLine.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public void print(Graphics graphics) {
        graphics.setColor(getColor());
        graphics.drawLine(getPoint1().getX(),
                getPoint1().getY(),
                getPoint2().getX(),
                getPoint2().getY());
    }
}
