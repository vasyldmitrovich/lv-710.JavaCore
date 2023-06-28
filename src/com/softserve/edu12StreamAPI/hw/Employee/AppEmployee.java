package com.softserve.edu12StreamAPI.hw.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppEmployee {
    public static void main(String[] args) {
        Stream<Employee> employeeStream = Stream.of(
                new Employee("Emily"),
                new Employee("Alice"),
                new Employee("John"),
                new Employee("Mary"),
                new Employee("Sam"),
                new Employee("Emily"),
                new Employee("Tom"),
                new Employee("Alice"),
                new Employee("David"),
                new Employee("Emily"),
                new Employee("Michael"),
                new Employee("Emma"),
                new Employee("Alice"),
                new Employee("Olivia"),
                new Employee("Tom"),
                new Employee("Sophia"),
                new Employee("Daniel"),
                new Employee("Lily"),
                new Employee("Alice"),
                new Employee("Grace")
        );
        mostPopularName(employeeStream);
    }
    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> map =
                employees
                        .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
//        map.forEach((name, count) -> System.out.println(name + ": " + count));
        Optional<Map.Entry<String, Long>> optional = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
if (optional.isPresent()){
    String result = optional.get().getKey();
    System.out.println(result);
}
else System.out.println("Optional is empty");
        return null;
    }
}
