package hw09;

import java.util.HashSet;
import java.util.Set;

public class TaskRunner {
    public static void main(String[] args) {
        task1();
        task2();
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

    }
}
