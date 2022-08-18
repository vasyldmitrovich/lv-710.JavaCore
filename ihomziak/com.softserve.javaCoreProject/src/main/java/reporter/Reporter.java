package reporter;

import popup.Popup;

public class Reporter {

    Popup popup = new Popup();

    public void reporter(int var) {
        System.out.println(var);
    }

    public void reporter(String var) {
        System.out.println(var);
    }

    public void reporter(double var) {
        popup.circlePopupResultMessage(var);
    }

    public void reporter(String name, String address) {
        System.out.println(name);
        System.out.println(address);
    }
    public void reporter(int[] customer) {
        System.out.println(customer);
    }
}
