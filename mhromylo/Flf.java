package soft;
import java.util.Scanner;

public class Flf {
   
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        
        System.out.print("a+b=");
        System.out.println(a+b);
        System.out.print("a-b=");
        System.out.println(a-b);
        System.out.print("a*b=");
        System.out.println(a*b);
        System.out.print("a/b=");
        System.out.println(a/b);
        in.close();
    }

}