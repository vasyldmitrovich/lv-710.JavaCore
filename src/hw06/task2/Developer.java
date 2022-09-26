package hw06.task2;

public class Developer extends Employee{
    private String position;
    public Developer(String position, String name, int age, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Position: %s, Name: %s, age: %d, Salary: /u20B4 %.2f.", position, name, age, salary);
    }
}
