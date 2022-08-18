package startprogram;

import popup.Popup;
import reporter.Reporter;

public class AddressNameProgram {

    Reporter reporter = new Reporter();
    Popup popup = new Popup();

    public static void main(String[] args) {
        AddressNameProgram addressNameProgram = new AddressNameProgram();
        addressNameProgram.startProgram();
    }

    void startProgram() {
        String name = popup.nameQuestion();
        String address = popup.addressQuestion(name);
        reporter.reporter(name, address);
    }
}
