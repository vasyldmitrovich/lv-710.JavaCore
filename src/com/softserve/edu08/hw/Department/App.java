package com.softserve.edu08.hw.Department;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 =
                new Department("main", new Department.Address("Dnipro", "Sicheslavska nab", 12));
        System.out.println(department1);
        Department department2 = (Department) department1.clone();
        department2.getAddress().setCity("Poltava");
        System.out.println(department2);
    }
}
