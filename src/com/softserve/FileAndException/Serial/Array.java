package com.softserve.FileAndException.Serial;

import java.io.*;
import java.util.Arrays;

public class Array {  // WriteArray
    public static void main(String[] args) throws IOException {
        Person[] people = new Person[]{
                new Person(3, "Jack"),
                new Person(4, "Bady"),
                new Person(3, "Lufi")
        };

        FileOutputStream fos = new FileOutputStream("array.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(people);

//        oos.writeInt(people.length);
//        for (Person person :
//                people) {
//            oos.writeObject(person);
//        }

        oos.close();
    }


    public static class ReadArray {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            FileInputStream fis = new FileInputStream("array.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[]) ois.readObject();

//            int personCount = ois.readInt();
//            Person[] people = new Person[personCount];
//
//            for (int i = 0; i < personCount; i ++){
//                people[i] = (Person) ois.readObject();
//            }

            System.out.println(Arrays.toString(people));

            ois.close();
        }
    }
}




