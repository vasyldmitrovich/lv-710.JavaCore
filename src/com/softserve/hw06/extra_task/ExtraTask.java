package com.softserve.hw06.extra_task;

import java.util.ArrayList;
import java.util.List;

/**
 * Create next types: Person (field String name), Student (fields String studyPlace, int studyYears)
 * and Worker (fields String workPosition, int experienceYears). Classes Student and Worker are derived
 * from class Person. All classes have getters to return fields.
 * Create a maxDuration() method of the MyUtils class to return a list of Students with maximum duration
 * of study and Workers with maximum experience.
 * For example, for a given list
 * [Person [name=Ivan], Student [name=Petro, studyPlace=University, studyYears=3],
 * Worker [name=Andriy, workPosition=Developer, experienceYears=12],
 * Student [name=Stepan, studyPlace=College, studyYears=4],
 * Worker [name=Ira, workPosition=Manager, experienceYears=8],
 * Student [name=Ihor, studyPlace=University, studyYears=4]]
 * you should get
 * [Worker [name=Andriy, workPosition=Developer, experienceYears=12],
 * Student [name=Stepan, studyPlace=College, studyYears=4],
 * Student [name=Ihor, studyPlace=University, studyYears=4]]
 */
public class ExtraTask {
    public void run() {
        List<Person> persons = new ArrayList<>() {{
            add(new Person("Ivan"));
            add(new Student("Petro", "University", 3));
            add(new Worker("Andriy", "Developer", 12));
            add(new Student("Stepan", "College", 4));
            add(new Worker("Ira", "Manager", 8));
            add(new Student("Igor", "University", 4));
        }};

        MyUtils.maxDuration(persons).forEach(System.out::println);
    }
}
