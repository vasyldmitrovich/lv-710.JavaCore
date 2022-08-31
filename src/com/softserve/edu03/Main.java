package com.softserve.edu03;

public class Main {public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.setName("Serhii Shevchuk");
    e1.setHours(24);
    e1.setRate(100);

    Employee e2 = new Employee();
    e2.setName("Ivan Bohyn");
    e2.setHours(20);
    e2.setRate(80);

    Employee e3 = new Employee();
    e3.setName("Ivan Mazepa");
    e3.setHours(30);
    e3.setRate(120);


    System.out.println(e1.toString());
    System.out.println(e2.toString());
    System.out.println(e3.toString());
    System.out.println("\nTotal Compensation: " + Employee.totalSum);
    e1.changeRate(200);
    System.out.println("\nTotal Compensation: " + Employee.totalSum);

    //TODO All did perfect, e1.toString() - toString do not need write because java use that method by default
}

}

