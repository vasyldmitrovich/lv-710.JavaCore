package startprogram;

import calculations.Calculations;
import io.Input;
import reporter.Reporter;

public class CirclePerimeter {

    Input input = new Input();
    Calculations calculations = new Calculations();
    Reporter reporter = new Reporter();

    public static void main(String[] args) {
        CirclePerimeter cP = new CirclePerimeter();
        cP.circlePerimeterProgram();
    }

    void circlePerimeterProgram() {
        reporter.reporter(calculations.circlePerimeter(input.inputInt()));
    }
}
