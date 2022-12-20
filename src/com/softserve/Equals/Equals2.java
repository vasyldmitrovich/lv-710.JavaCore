package com.softserve.Equals;

import com.softserve.Inheritance.Dog;

public class Equals2 {
    ///////////////////////////////////////////////////////////////////////////
    // в этом классе я изучаю метод Equals
    ///////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        int q = 3;
        long t = 3;
        System.out.println(q == t);

        Bierd pet1 = new Bierd(2);
        Bierd pet2 = new Bierd(2);
        Object ob = new Object();
        System.out.println(pet2.equals(pet1));
    }
}

class Bierd {
    int id;

    public Bierd(int id1) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        int id;
        Bierd otherPet = (Bierd) obj;
        return this.id == otherPet.id;
    }
}
