package hw09;

import java.util.Iterator;
import java.util.List;

public class StudentsUtil {
    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (course == student.getCourse()) {
                course = student.getCourse();
                System.out.println(student);
            }
        }

    };
}