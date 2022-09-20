package com.softserve.hw06.extra_task;


import java.util.*;
import java.util.stream.Collectors;

public class MyUtils {
    public static List<Person> maxDuration(List<? extends Person> people) {
        int maxStudyYears = people.stream()
                .filter(person -> person.getClass().getSimpleName().equals("Student"))
                .mapToInt(person -> ((Student) person).getStudyYears())
                .max()
                .getAsInt();

        int maxExperienceYears = people.stream()
                .filter(person -> person.getClass().getSimpleName().equals("Worker"))
                .mapToInt(person -> ((Worker) person).getExperienceYears())
                .max()
                .getAsInt();

        return people.stream()
                .filter(person -> isMaxDuration(person, maxStudyYears, maxExperienceYears))
                .collect(Collectors.toList());

    }

    private static boolean isMaxDuration(Person person, int maxStudyYears, int maxExperienceYears) {
        if (person.getClass().getSimpleName().equals("Student")) {
            return ((Student) person).getStudyYears() == maxStudyYears;
        } else if (person.getClass().getSimpleName().equals("Worker")) {
            return ((Worker) person).getExperienceYears() == maxExperienceYears;
        }
        return false;
    }
}
