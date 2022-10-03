package hw08;


import java.util.List;

public class TaskRunner {
        public static void main(String[] args) {
            task1();
            task2();
        }

        public static void task1() {
            Student student1 = new Student(new FullName("Nadia", "Fomenko"), 23, 4);
            Student student2 = new Student(new FullName("Ira", "Petrenko"), 20, 2);
            Student student3 = new Student(new FullName("Ivan", "Hischuk"), 20, 3);
            Student student4 = new Student(new FullName("Inna", "Kvitochka"), 19, 1);
            List<Student> students = List.of(student1, student2, student3, student4);

            for (Student student : students){
                System.out.println(student.info());
                System.out.println(student.activity());
            }



        }

        public static void task2() {

        }
    }

