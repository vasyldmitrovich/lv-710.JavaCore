package com.softserve.FileAndException.Serial;

import java.io.*;

public class Person implements Serializable {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " " + name;
    }


    public static class WriteObject {
        public static void main(String[] args) {
            Person pers1 = new Person(1, "David");
            Person pers2 = new Person(2, "Jim");
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){

                oos.writeObject(pers1);
                oos.writeObject(pers2);

            } catch (IOException e) {
                throw new RuntimeException(e);

            }
        }


        public static class ReadObject {
            public static void main(String[] args) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){


                    Person pers1 = (Person) ois.readObject();
                    Person pers2 = null;
                    pers2 = (Person) ois.readObject();

                    System.out.println(pers1 + "\n" + pers2);

                } catch (IOException | ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

            }
        }

    }
}



