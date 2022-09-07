package com.softserve.edu05.practical_tasks.task2.factorys;

import com.softserve.edu05.practical_tasks.task2.entities.Analyst;
import com.softserve.edu05.practical_tasks.task2.entities.Employee;

public class FactoryAnalyst implements AbstractFactory {
    @Override
    public Employee getEmployee(String name, double salary) {
        return new Analyst(name, salary);
    }
}
