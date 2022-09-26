package hw06.task1;

public class Chicken extends NonFlyingBird {

    public Chicken(String feathers) {
        super(feathers);

    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("But I try.");
    }
}
