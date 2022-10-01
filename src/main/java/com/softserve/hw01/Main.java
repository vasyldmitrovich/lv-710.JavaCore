package com.softserve.hw01;

public class Main {

    public static void main(String[] args) {
        MathCalculations calc = new MathCalculations();
        Questions questions = new Questions();

        calc.circlePerimeter(3);
        calc.circleArea(5);

        questions.addressQuestion();
    }
}
