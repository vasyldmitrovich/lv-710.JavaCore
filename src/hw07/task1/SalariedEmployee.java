package hw07.task1;

import java.math.BigDecimal;

public class SalariedEmployee extends Employee {
    private final int hourlySalary;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, int hourlySalary, String socialSecurityNumber) {
        super(employeeId);
        this.hourlySalary = hourlySalary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public BigDecimal calculatePay() {
        return BigDecimal.valueOf(hourlySalary)
                .multiply(BigDecimal.valueOf(8));
    }
}
