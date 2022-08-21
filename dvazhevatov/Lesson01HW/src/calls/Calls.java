package calls;

import main.Main;
import java.text.DecimalFormat;

public class Calls {
    private static final int[] countries = new int[3];
    private static final int[] time = new int[3];
    private static final int[] standardUnitsPerCall = new int[3];
    private static final int STAT100 = 100;
    private static int standUnitsForAllCalls = 0;
    private static int allCallsDuration = 0;
    private static final DecimalFormat format = new DecimalFormat("00");

    public static void getCallReport() {
        bannerMOTD();
        for (int i = 0; i < time.length; i++) {
            System.out.print("Cost for c" + (i + 1) + " in USD: ");
            countries[i] = parseInput();
            System.out.print("Duration for t" + (i + 1) + " in minutes ");
            time[i] = Main.readInputInt();
            standardUnitsPerCall[i] = getStandardUnits(countries[i], time[i]);
        }

        System.out.println();
        for (int i : standardUnitsPerCall) standUnitsForAllCalls += i;
        for (int i = 0; i < time.length; i++) {
            System.out.print("Cost for c" + (i + 1) + " with t" + (i + 1) +
                    " (int): " + standardUnitsPerCall[i] + "\n");
        }

        System.out.println("Summary cost (int): " + standUnitsForAllCalls);
        System.out.println("\nAfter formatting:\n");

        for (int i = 0; i < time.length; i++) {
            System.out.print("Cost for conversation #" + (i + 1) + ": ");
            getSUcalc(standardUnitsPerCall[i]);
            System.out.print(" USD, call duration: " + time[i] + " minutes;");
            System.out.println();
        }

        for (int i : time) allCallsDuration += i;
        System.out.print("\nSummary duration of all calls: " + allCallsDuration + " minutes;");

        System.out.print("\nSummary cost for all calls: ");
        getSUcalc(standUnitsForAllCalls);
        System.out.print(" USD;");
    }

    private static int parseInput() {
        try {
            String input = Main.readInputString();
            String[] params = input.split(",");
            int firstVariable = Integer.parseInt(params[0]);
            int secondVariable = Integer.parseInt(params[1]);
            return STAT100 * firstVariable + secondVariable;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("try again");
            return parseInput();
        }
    }
    private static int getStandardUnits(int a, int b) {
        return a * b;
    }

    public static void bannerMOTD() {
        System.out.println("You need to enter the amount in the format like: 9,09\n" +
                "using comma and time in minutes, for example: 76\n");
    }

    private static void getSUcalc(int a) {
        int main = a / 100;
        int other = a % 100;
        System.out.print(format.format(main) + "," + format.format(other));
    }
}
