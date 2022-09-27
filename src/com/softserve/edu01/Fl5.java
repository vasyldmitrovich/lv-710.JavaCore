package soft;
import java.util.Scanner;

public class Fl5 {
   
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input c1: ");
        int c1 = in.nextInt();
        System.out.print("Input c2: ");
        int c2 = in.nextInt();
  
        System.out.print("Input c3: ");
        int c3 = in.nextInt();
        System.out.print("Input t1: ");
        int t1 = in.nextInt();
   
        System.out.print("Input t2: ");
        int t2 = in.nextInt();
        System.out.print("Input t3: ");
        int t3 = in.nextInt();
        
        System.out.println("first call costs=" +c1*t1);
       
        System.out.println("second call costs=" +c2*t2);
        
        System.out.print("third call costs=" +c3*t3);
              in.close();
    }

}