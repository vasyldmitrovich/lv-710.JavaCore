package com.softserve.edu06.practik.Composition;

public class Line {
private Point point1;
private Point point2;

    public Line() {
    }

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Line { " +
                "point1 " + getPoint1() +
                ", point2 " + getPoint2() +
                '}';
    }
    public void print() {
        System.out.println("drawing line with point1: " + getPoint1() + "with point2: " + getPoint2());
    }
}
