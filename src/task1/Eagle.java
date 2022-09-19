package task1;

public class Eagle extends FlyingBird{

    public Eagle(String feathers) {
        super(feathers);
    }

    @Override
    public void fly() {
        System.out.println("I fly highly in the sky");
    }
}
