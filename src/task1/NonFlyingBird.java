package task1;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(String feathers) {
        super(feathers, true);
    }

    @Override
    public void fly() {
        System.out.println("I don`t fly");
    }
}
