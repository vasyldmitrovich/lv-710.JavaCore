package com.softserve.Equals;

import com.softserve.Enum.Animal;
import com.softserve.Inheritance.Dog;

public class Equals extends Dog {
    ///////////////////////////////////////////////////////////////////////////
    // в этом классе я изучаю метод Equals
    ///////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        int q = 3;
        long t = 3;
        System.out.println(q == t);
        System.out.println();


        String one = "Hello";
        String two = "Hello123".substring(0, 5);
        System.out.println(two);
        System.out.println(one == two);
        System.out.println(one.equals(two));
        System.out.println();



        Dog pet1 = new Dog(2123);
        Dog pet2 = new Dog(2123);
        Object ob = new Object();
        System.out.println(pet2.equals(pet1));
    }


//        class Dog {
//            int id;
//            public Dog(int id1) {
//                this.id = id;
//            }

    @Override
    public boolean equals(Object obj) {
        int id;
        Dog otherPet = (Dog) obj;
        return this.id == otherPet.id;
    }
}
   
   
   



