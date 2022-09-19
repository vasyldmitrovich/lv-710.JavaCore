package task1;

public class TaskRunner {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Bird[] birds = new Bird [6];
        birds[0] = new FlyingBird("grey");
        birds[1] = new Eagle("red");
        birds[2] = new Swallow("yellow");
        birds[3] = new NonFlyingBird("grey");
        birds[4] = new Penguin("White");
        birds[5] = new Chicken("black");

        for (int i = 0; i < birds.length; i++) {
            birds[i].fly();

        }

    }
}

