package com.softserve.Inheritance.Casting;

public class Test {
    public static void main(String[] args) {
        Box box = new Box();
        HeaveBox heaveBox = new HeaveBox(10.4);
        heaveBox.getWeight();

        Box box2 = new HeaveBox(3.4);
        HeaveBox heaveBox2 = (HeaveBox) box2;
        System.out.println(heaveBox2.getWeight());
        //////// или /////////
        System.out.println(((HeaveBox) box2).getWeight());
//        HeaveBox heaveBox3 = (HeaveBox) new Box();     /// недопустимое приведение
//        heaveBox3.getWeight();
        System.out.println(inst(heaveBox2));

        HeaveBox[] heaveBox4 = new HeaveBox[2];
//        Box[] box4 = heaveBox4;
//        box4[0] = new Box();   /// недопустимое приведение
        Box[] box4 = new Box[4];
        box4[0] = new Box();

       boolean h =  box2 instanceof InterBox & box2 instanceof InterHeaveBox & box2 instanceof Box;
        System.out.println(h);

    }

    public static boolean inst(Object o) {
        if (o instanceof HeaveBox & o instanceof Box & o instanceof InterBox) {
            return true;
        }
        return false;
    }
}
