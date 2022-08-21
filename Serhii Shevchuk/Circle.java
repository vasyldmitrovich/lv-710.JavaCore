import java.text.DecimalFormat;
import  java.util.Scanner;
public class Circle {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введіть радіус : ");
        float r=sc.nextFloat();
        double area=Math.PI*Math.pow(r,2);
        double per=2*Math.PI*r;

        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Площа : "+df.format(area));
        System.out.println("Периметр :"+df.format(per));
    }
    }
