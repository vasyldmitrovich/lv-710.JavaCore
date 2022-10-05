package hw09;

import java.util.*;

public class TaskRunner {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        Set set1 = new HashSet<>();
        Set set2 = new HashSet<>();
        set1.add(12);
        set1.add(45);
        set1.add(78);
        set2.add(98);
        set2.add(76);
        set2.add(56);
        System.out.println(Utils.union(set1, set2));
        
    }

    public static void task2() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Orest", "Beley");
        personMap.put("Oksana", "Rubanets");
        personMap.put("Olha", "Lutska");
        personMap.put("Orest", "Beleyko");
        personMap.put("Askold", "Psraschin");
        personMap.put("Oleh", "Onufrik");
        personMap.put("Ihor", "Shevchuk");
        personMap.put("Andriy", "Ivanov");
        personMap.put("Marina", "Tkachuk");
        personMap.put("Katerina", "Jus");


        String result1 = personMap.get("Ihor");
        System.out.println(result1);
        String result2 = personMap.get("Orest");
        System.out.println(result2);
        String result3 = personMap.remove("Orest");
        System.out.println(result3 + "  was removed");



    }

    public static void task3() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Oleh", 3));
        students.add(new Student("Ira", 4));
        students.add(new Student("Roman", 5));
        students.add(new Student("Veronika", 2));
        StudentsUtil.printStudents(students,5);
        students.sort(new Student.StudentNameComparator());
        System.out.println(students);
        students.sort(new Student.StudentCourseComparator());
        System.out.println(students);


    }
}
