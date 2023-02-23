package soft;
import java.util.Scanner;

public class Flt {
   
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input radius: ");
        int r = in.nextInt();
        double area = Math.PI*(r*r);  
        System.out.println("Area of circle is: "+area);  
        double cir = 2*(Math.PI*r);  
        System.out.println("perimeter of circle is: "+cir);;
        in.close();
    }

}