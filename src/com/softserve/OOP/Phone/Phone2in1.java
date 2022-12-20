package com.softserve.OOP.Phone;

public class Phone2in1 {
    public static void main(String[] args) {
        Phone1 myPhone = new Phone1("one", "samsung", 100.4, -2);

        Phone myPhone2 = new Phone("one", "samsung", 100.4);
        Phone myPhone3 = new Phone("one", "nokia", 100.4);

        myPhone.setName("пятерка");
        Phone1.message = "дай 5";
        Phone1.message = "дай 10";
        Phone1.message = "дай 15";
        System.out.println(myPhone3.equals(myPhone2));
        System.out.println("toString: " + myPhone);
        System.out.println("toString: " + myPhone2);


//        myPhone.getName();
//        myPhone.speak();
        System.out.println(myPhone.getName());
        System.out.println(Phone1.getMessage());
        System.out.println(myPhone.constante);
        System.out.println(myPhone);
        Phone.sendMessage("hello", "44343", "342424");
    }
}




class Phone1 {
    private String number;
    private String model;
    private double weight;
    static String message;
    final int constante;
    final static int constante1 = 5;


    public Phone1(String number, String model, double weight, int constante) {
        System.out.println(1);
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.constante = constante;
    }

    public Phone1(String number, int constante) {
        this.constante = constante;
        System.out.println(2);
        this.number = number;
    }

    public Phone1(double weight, int constante) {
        this.constante = constante;
        System.out.println(3);
        this.weight = weight;
    }

    void setName(String model) {
        if (model.isEmpty()) {
            System.out.println("ошибка ввода");
        } else {
            this.model = model;

        }
    }

    String getName() {
        return model;
    }

    void speak() {
        System.out.println("Этот телефон называется: " + model);
    }


    static String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public String toString() {
        return "Phone1{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}