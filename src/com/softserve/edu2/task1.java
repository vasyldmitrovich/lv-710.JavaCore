import java.util.Scanner;


public class Main {
    public static void main(String[] args){
            final double Pi = 3.1415926536;
    { System.out.println("type circle radius");
        Scanner sc = new Scanner(System.in);
         String r = sc.nextLine();
        double val = Double.parseDouble(r);
        double per = 2*Pi*val;
          System.out.println("Perimeter = " + per);
          double plo = Pi*(val*val);
        System.out.println("Area =  " + plo);

    }


    }
}