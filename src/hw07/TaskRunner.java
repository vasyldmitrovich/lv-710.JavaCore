package hw07;

import hw07.task1.ContractEmployee;
import hw07.task1.Employee;
import hw07.task1.SalariedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskRunner {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new SalariedEmployee(UUID.randomUUID().toString(), 345, "5678");
        Employee employee2 = new SalariedEmployee(UUID.randomUUID().toString(), 567, "9874");
        Employee employee3 = new ContractEmployee(UUID.randomUUID().toString(), 80000, "5690");
        Employee employee4 = new ContractEmployee(UUID.randomUUID().toString(), 80700, "6743");
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
employeeList.sort(new Employee.EmployeeComparator());
        System.out.println(employeeList);

    }

    public static void task2() {

    }
}