package com.softserve.edu05.practical_tasks.task2.factorys;

import com.softserve.edu05.practical_tasks.task2.entities.Developer;
import com.softserve.edu05.practical_tasks.task2.entities.Employee;

public class FactoryDeveloper implements AbstractFactory {

    @Override
    public Employee getEmployee(String name, double salary) {
        return new Developer(name, salary);
    }
}
