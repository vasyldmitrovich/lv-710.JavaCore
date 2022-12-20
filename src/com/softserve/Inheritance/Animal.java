package com.softserve.Inheritance;

public class Animal {
    int id;
   public Animal (int id) {
        this.id = id;
    }
    public Animal () {
    }

   protected StringBuilder name = new StringBuilder("some animal");
    public void eat (){
        System.out.println(id + " I am eating");
    }
    public void voice (){
        System.out.println("I am voting");
    }
    public String toString() {
        return String.valueOf(id);
    }

}
