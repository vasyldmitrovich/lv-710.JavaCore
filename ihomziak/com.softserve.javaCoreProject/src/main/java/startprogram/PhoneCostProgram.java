package startprogram;

import calculations.Calculations;

public class PhoneCostProgram {

    Calculations calculations = new Calculations();

    void startProgram() {
        calculations.profit(calculations.randomCallersQuantity());
    }

    public static void main(String[] args) {
        PhoneCostProgram phoneCostProgram = new PhoneCostProgram();
        phoneCostProgram.startProgram();
    }
}
