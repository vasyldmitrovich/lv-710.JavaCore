package com.softserve.hw01;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        task1();
        task3();
        task2();
    }

    public static void task1() {
        MathCalculations calc = new MathCalculations();
        calc.circlePerimeter(3);
        calc.circleArea(5);
    }

    public static void task2() {
        Questions questions = new Questions();
        questions.addressQuestion();
    }

    public static void task3() {
        MathCalculations calc = new MathCalculations();
        List<User> users = List.of(new User[]{
                new User("Lora", 2, 1),
                new User("John", 3, 2)
        });
        calc.phoneCallCoast(users);
    }
}
