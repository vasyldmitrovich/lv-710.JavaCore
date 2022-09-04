package com.softserve.hw03;

public class Main {
    public static void main(String[] args) {
        Person aldousHuxley = new Person("George", "Orwell");
        aldousHuxley.setBirthDate(1963);
        aldousHuxley.getAge();
        aldousHuxley.output();
        aldousHuxley.changeName("Aldous", "Huxley");
        aldousHuxley.output();
        Person leninaCrowne = new Person();
        leninaCrowne.setFirstName("Lenina");
        leninaCrowne.setLastName("Crowne");
        leninaCrowne.setBirthDate(1983);
        leninaCrowne.getAge();
        leninaCrowne.output();
        Person fannyCrowne = new Person();
        fannyCrowne.input();
        fannyCrowne.getAge();
        fannyCrowne.output();
        Person bernardMarx = new Person("Bernard", "Marx");
        bernardMarx.setBirthDate(1988);
        bernardMarx.getAge();
        bernardMarx.output();
        Person benitoHoover = new Person("Benito", "Hoover");
        benitoHoover.setBirthDate(1946);
        benitoHoover.getAge();
        benitoHoover.output();
    }
}
