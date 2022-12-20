package com.softserve.OOP.Redefinition;

public class Test {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Triangle(10, 10, 10);
        figures[1] = new Triangle(15, 15, 15);
        figures[2] = new Rectangle(20, 20);
        figures[3] = new Rectangle(30, 30);

        for (Figure figure :
                figures) {
//            figure.getArea();

            System.out.println(figure);
        }
    }
}
