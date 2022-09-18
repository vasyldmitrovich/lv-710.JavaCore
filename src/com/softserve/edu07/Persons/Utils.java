package com.softserve.edu07.Persons;

import java.util.ArrayList;

public class Utils {
    public static void run() {
        var persons = new ArrayList<Person>();
        persons.add(new Student("Ivan"));
        persons.add(new Teacher("Petro"));
        persons.add(new Cleaner("Igor"));
        persons.add(new Student("Irina"));
        persons.add(new Teacher("Oksana"));
        persons.add(new Cleaner("Olena"));
        for (Person person:persons) {
            person.print();
            if (person instanceof Staff) ((Staff) person).salary();
        }

    }
}
