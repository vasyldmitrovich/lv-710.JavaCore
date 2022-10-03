package hw08;

public class Student extends Person{
    private final static String INFO_MESSAGE =
            "First name: %s, Last name: %s, Age: %d, Course: %d";
    private final static String ACTIVITY_MESSAGE = "I study at university";
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String activity() {
        return ACTIVITY_MESSAGE;
    }

    @Override
    public String info() {
        return INFO_MESSAGE.formatted(fullName.getFirstName(), fullName.getLastName(), age, course);
    }
}
