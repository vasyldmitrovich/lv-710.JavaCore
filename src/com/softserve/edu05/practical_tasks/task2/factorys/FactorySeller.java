package com.softserve.edu05.practical_tasks.task2.factorys;

import com.softserve.edu05.practical_tasks.task2.entities.Employee;
import com.softserve.edu05.practical_tasks.task2.entities.Seller;

public class FactorySeller implements AbstractFactory {

    @Override
    public Employee getEmployee(String name, double salary) {
        return new Seller(name, salary);
    }
}
