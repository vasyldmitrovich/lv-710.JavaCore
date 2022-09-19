package task1;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("I fly");

    }
}
