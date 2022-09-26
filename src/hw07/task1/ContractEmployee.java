package hw07.task1;

import java.math.BigDecimal;

public class ContractEmployee  extends Employee {
    private int fixedSalary;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, int fixedSalary, String federalTaxIdMember) {
        super(employeeId);
        this.fixedSalary = fixedSalary;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public BigDecimal calculatePay() {
        return BigDecimal.valueOf(fixedSalary);
    }
}
