package com.softserve.edu06.practik.Composition;

public class ColorLine extends Line{
    private String Color;

    public ColorLine() {
    }

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{ " +
                "Color: " + getColor() +
                " point1=" + getPoint1() +
                ", point2=" + getPoint2() +
                '}'+ '\'';
    }
    @Override
    public void print() {
        System.out.println("drawing colorline with color: " + getColor() +
                " with point1: " + getPoint1() + "with point2: " + getPoint2());
    }
}
