package homework.lesson_1;


import java.util.ArrayList;
import java.util.List;

import static homework.lesson_1.MessageHelper.*;

/**
 * Phone calls from three different countries are с1, с2 and с3 standard
 * units per minute. Talks continued t1, t2 and t3 minutes. How much computer
 * will count for each call separately and all talk together? Input all source
 * data from console, make calculations and output to the screen.
 */

public class PhoneCallsTask {
    private static final int AMOUNT_CALLS = 3;
    private static List<Conversation> callsList = new ArrayList<>();

    protected static void calculateCallsCost() {
        fillCallsList();
        shouInfoAboutCalls();
    }

    private static void fillCallsList() {
        for (int i = 1; i <= AMOUNT_CALLS; i++) {
            writeMessage("Enter the call time for conversation #" + i + ":");
            int timing = readIntMessage();
            writeMessage("Enter the call tariff for conversation #" + i + ":");
            double tariff = readDoubleMessage();
            callsList.add(new Conversation(timing, tariff));
        }
    }

    private static void shouInfoAboutCalls() {
        writeMessage("\n__Calls information__\n");
        for (int i = 0; i < callsList.size(); i++) {
            writeMessage((i + 1) + " conversation:");
            writeMessage(callsList.get(i).toString());
        }
        writeMessage("Total calls duration: " + getTotalTiming());
        writeMessage("Total costs of calls: " + String.format("%.2f", getTotalPrice()));
    }

    private static int getTotalTiming() {
        return callsList.stream()
                .mapToInt(Conversation::getTiming)
                .sum();
    }

    private static double getTotalPrice() {
        return callsList.stream()
                .mapToDouble(Conversation::getPrise)
                .sum();
    }



    private static class Conversation {
        private int timing;
        private double tariff;
        private double prise;


        public Conversation(int timing, double tariff) {
            this.timing = timing;
            this.tariff = tariff;
            this.prise = tariff * timing;
        }

        public Conversation() {
        }

        public int getTiming() {
            return timing;
        }

        public double getTariff() {
            return tariff;
        }

        public double getPrise() {
            return prise;
        }

        @Override
        public String toString() {
            return String.format("""
                    timing - %d
                    tariff - %.2f
                    prise - %.2f
                    """, timing, tariff, prise);
        }
    }
}
