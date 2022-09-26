package hw06.task1;

import hw06.task1.Bird;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("I don`t fly");
    }
}
