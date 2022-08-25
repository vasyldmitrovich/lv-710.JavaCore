package com.softserve.edu;

public class Main {
    public static void main(String[] args) {
        Employee yurii = new Employee("Yurii", 10, 172);
        Employee stepan = new Employee("Stepan", 10, 164);
        Employee serhii = new Employee("Serhii", 10, 156);
        System.out.println(yurii.toString());
        System.out.println(yurii.getName() + "'s salary in this month is " + yurii.getSalary() + " USD/hour");
        yurii.changeRate(11);
        System.out.println("But he worked well and we decide to increase his rate to " + yurii.getRate() + " USD/hour");
        System.out.println("Also Yurii gets bonus " + (yurii.getBonuses()) + " USD");
        System.out.println("So, final " + yurii.getName() + "'s salary in this month is "
                + Employee.getTotalSum() + " USD");
        System.out.println(stepan.toString());
        System.out.println(stepan.getName() + "'s salary in this month is " + stepan.getSalary() + " USD");
        System.out.println(serhii.getName() + "'s salary in this month is " + serhii.getSalary() + " USD");
        System.out.println("Our team's salary expenses in this month are " + Employee.getTotalSum() + " USD");

    }
}
