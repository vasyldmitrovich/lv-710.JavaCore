package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import static com.softserve.edu09.hw.RunMyStudentsApp.Student.*;

public class RunMyStudentsApp {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(75);
        studentList.add(0, new Student("Maria", 4));
        studentList.add(1, new Student("Ivan", 3));
        studentList.add(2, new Student("Anna", 2));
        studentList.add(3, new Student("Ira", 4));
        studentList.add(4, new Student("Stas", 3));
        printStudents(studentList,4);
        System.out.println(compareByCourse(studentList));
        System.out.println(compareByName(studentList));

    }

    public static class Student {
        private String name;
        private int course;

        public Student(String name, int course) {
            this.name = name;
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            if (course != student.course) return false;
            return Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + course;
            return result;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", course=" + course +
                    '}';
        }

        public static void printStudents(List students, Integer course) {
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student st = iterator.next();
                if (st.getCourse() == course) {
                    System.out.println(st.getName());
                }
            }
        }

        public static List<Student> compareByName(List<Student> studentList) {
            studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
            return studentList;
        }

        public static List<Student> compareByCourse(List<Student> studentList){
            studentList.sort((o1, o2) -> o1.getCourse()- o2.getCourse());
            return studentList;
        }
    }
}
