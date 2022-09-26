package task1;

import java.math.BigDecimal;

public class Employee implements Payment {
    String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public BigDecimal calculatePay() {
        return null;
    }
}
