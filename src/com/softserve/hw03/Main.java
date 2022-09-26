package hw03;

import hw03.Person;

public class Main {
    public static void main(String[] args) {

        Person.count = 0;

        Person person1 = new Person();
        person1.input();

        Person person2 = new Person("Jane", "Austin");
        person2.setBirthYear(1985);

        Person person3 = new Person();
        person3.setFirstName("John");
        person3.setLastName("Doe");
        person3.setBirthYear(1975);

        Person person4 = new Person("Graham", "Northon");
        person4.setBirthYear(1997);

        Person person5 = new Person("Andie", "Whalberg");
        person5.setBirthYear(1995);


        person1.output();
        person3.changeName("Carrie","Smith");
        person3.output();
    }
}