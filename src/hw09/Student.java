package hw09;

import java.util.Comparator;

public class Student {
    private String name;
    private Integer course;

    public String getName() {
        return name;
    }

    public Integer getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;


    }


    public static class StudentNameComparator implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class StudentCourseComparator implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return o1.getCourse().compareTo(o2.getCourse());
        }

    }
}
