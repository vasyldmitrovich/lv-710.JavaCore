package hw06.task1;

import hw06.task1.Bird;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("I fly");

    }
}
