package hw08;

public abstract class Person {
    private final static String INFO_MESSAGE = 
            "First name: %s, Last name: %s, Age: %d";

    protected FullName fullName;
    protected int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public abstract String activity();


    public String info() {
        return INFO_MESSAGE.formatted(fullName.getFirstName(), fullName.getLastName(), age);
    }
}
