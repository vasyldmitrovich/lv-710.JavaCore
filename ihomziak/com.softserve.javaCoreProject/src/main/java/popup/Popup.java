package popup;

import io.Input;

import static java.lang.String.format;

public class Popup {

    private final String WHERE_YOU_LIVE = "Where are you live %s?";
    private final String WHAT_IS_YOUR_NAME = "What is your name?";
    private final String CIRCLE_RADIUS = "Circle radius = ";
    private final String CUSTOMER_POPUP = "Customer %d, spend money: %d";


    public void circlePopup() {
        System.out.println("Please input circle radius:");
    }

    public void circlePopupResultMessage(double var) {
        System.out.println(CIRCLE_RADIUS + var);
    }

    public String nameQuestion() {
        System.out.println(WHAT_IS_YOUR_NAME);
        return new Input().inputString();
    }

    public String addressQuestion(String name) {
        System.out.println(format(WHERE_YOU_LIVE, name));
        return new Input().inputString();
    }

    public void customerPopup(int[] customer, int moneyAmount) {
        for(int i = 0; i >= customer.length; i++) {
            System.out.println(format(CUSTOMER_POPUP, customer, moneyAmount));
        }
    }
}
