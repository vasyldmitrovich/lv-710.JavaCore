package hw07.task1;

import java.math.BigDecimal;
import java.util.Comparator;

public class Employee implements Payment {
    String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public BigDecimal calculatePay() {
        return null;
    }


    public static class EmployeeComparator implements Comparator<Employee> {
        public int compare(Employee o1, Employee o2) {
            return o1.calculatePay().compareTo(o2.calculatePay());
        }

    }
}
