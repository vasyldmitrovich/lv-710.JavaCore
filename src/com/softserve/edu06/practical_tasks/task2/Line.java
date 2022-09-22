package com.softserve.edu06.practical_tasks.task2;

import java.awt.*;
import java.util.Objects;

public class Line implements Demonstration {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(point1, line.point1) && Objects.equals(point2, line.point2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point1, point2);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    @Override
    public void print(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.drawLine(getPoint1().getX(),
                getPoint1().getY(),
                getPoint2().getX(),
                getPoint2().getY());
    }
}
