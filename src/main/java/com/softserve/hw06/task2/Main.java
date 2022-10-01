package com.softserve.hw06.task2;

public class Main {

    private final Developer d = new Developer();

    public static void main(String[] args) {
        task1();
    }

    public static void task1(){
        Developer aqeDev = new Developer("John", 25, "Average AQE", 26000);
        System.out.println(aqeDev.report());

        Developer developer = new Developer("Richard", 30, "Average Developer", 25000);
        System.out.println(developer.report());;
    }
}
