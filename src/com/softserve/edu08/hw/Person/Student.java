package com.softserve.edu08.hw.Person;

public class Student extends Person implements Cloneable{
    private int Course;

    public Student() {
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        Course = course;
    }

    public int getCourse() {
        return Course;
    }

    public void setCourse(int course) {
        Course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return Course == student.Course;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Course;
        return result;
    }

    @Override
    public String info() {
        return super.info() + ", Курс: <" + getCourse() + ">";
    }

    @Override
    public String activity() {
        return "Я навчаюсь в університеті";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        copyOfStudent.fullName = (FullName) copyOfStudent.getFullName().clone();
        return copyOfStudent;
    }
}
