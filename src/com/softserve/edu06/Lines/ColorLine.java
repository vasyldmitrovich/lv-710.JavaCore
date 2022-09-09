package com.softserve.edu06.Lines;

public class ColorLine extends Line {
    String color;

    public ColorLine(Point firstPoint, Point secondPoint, String color) {
        super(firstPoint, secondPoint);
        this.color = color;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                '}';
    }
}
