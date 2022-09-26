package com.softserve.edu08.practical_tasks.task2;

public class Task2 {
    public void run() {
        System.out.println("create shapes: ");
        Wrapper<Shape> square = new Wrapper<>(new Square());
        Wrapper<Shape> circle = new Wrapper<>(new Circle());
        System.out.println(square + "\n" + circle);
    }
}
