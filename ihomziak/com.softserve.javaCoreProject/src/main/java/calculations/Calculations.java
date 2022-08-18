package calculations;

import java.util.Random;

public class Calculations {

    Random random = new Random();

    public int profit(int[] costumersQuantity){
        int var = 0;
        for(int i = 0; i < costumersQuantity.length; i++) {
            costumersQuantity[i] = randomMinuteCoast() * randomMinuteAmount();
            System.out.println("Customer " + i + ": " + costumersQuantity[i]);
            var = var + costumersQuantity[i];
        }
        System.out.println("Total profit: " + var + "$");
        return var;
    }

    public int[] randomCallersQuantity() {
        return new int[random.nextInt(1000)];
    }

    public double circlePerimeter(int radius) {
        return 2*Math.PI*radius;
    }

    public int randomMinuteCoast() {
        return random.nextInt(5);
    }

    public int randomMinuteAmount() {
        return random.nextInt(60);
    }
}
