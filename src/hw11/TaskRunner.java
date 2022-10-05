package hw11;

public class TaskRunner {
    public static void main(String[] args) {
        task1();

    }
    public static void task1() {
        double number1 = 567.9;
        double number2 = 876.4;
        double number3 = 0.0;

        System.out.println("Result = " + div(number1, number2));

        try {

            System.out.println("Result = " + div(number2,number3));

        } catch (ArithmeticException exception) {
            System.out.println(exception.getLocalizedMessage());
        }

    }
        public static double div(double number1, double number2) throws ArithmeticException {
        return number1/number2;

        }
    }
