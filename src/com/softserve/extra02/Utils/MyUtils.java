package com.softserve.extra02.Utils;

import com.softserve.extra02.Persons.Person;
import com.softserve.extra02.Persons.Student;
import com.softserve.extra02.Persons.Worker;

import java.util.ArrayList;

public class MyUtils {
    public static void run(){
        ArrayList<Person> personArrayList =new ArrayList<>();
        personArrayList.add(new Person("Ivan"));
        personArrayList.add(new Student("Petro","University",3));
        personArrayList.add(new Worker("Andriy","Developer",12));
        personArrayList.add(new Student("Stepan","College",4));
        personArrayList.add(new Worker("Ira","Manager",8));
        personArrayList.add(new Student("Ihor","University",4));
        System.out.println(maxDuration(personArrayList));
    }
    public static ArrayList<Person> maxDuration(ArrayList<Person> persons){
        ArrayList<Person> personArrayList =new ArrayList<>();

        //System.out.println(persons.stream().max(Person::compareTo));
        int maxStudent=Integer.MIN_VALUE;
        int maxWorker=Integer.MIN_VALUE;
        for (Person person: persons) {
            if (person instanceof Student)
                if (((Student)person).getStudyYears()>maxStudent) maxStudent=((Student)person).getStudyYears();
            if (person instanceof Worker)
                if (((Worker)person).getExperienceYears()>maxWorker) maxWorker=((Worker)person).getExperienceYears();
           }
        for (Person person: persons) {
            if (person instanceof Student) {
                if (((Student) person).getStudyYears() == maxStudent) personArrayList.add(person);
                continue;
            }
            if (person instanceof Worker) {
                if (((Worker) person).getExperienceYears() == maxWorker) personArrayList.add(person);
                //continue;
            }
            else personArrayList.add(person);

        }
        return personArrayList;
    }
}
