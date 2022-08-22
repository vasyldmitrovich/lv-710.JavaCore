import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 1");
        int a, b;
        System.out.print("Enter a value - ");
        a = Integer.parseInt(scan.nextLine());
        System.out.print("Enter b value - ");
        b = Integer.parseInt(scan.nextLine());
        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " + (a*b));
        System.out.println("a/b = " + (a/b));

        System.out.println("\nTask 2");
        String name, feelings;
        System.out.print("What's your name? ");
        name = scan.nextLine();
        System.out.print("How's your feelings " + name + "? ");
        feelings = scan.nextLine();
        System.out.println(name + " is feeling " + feelings);

        System.out.println("Task 3");
        float radius;
        System.out.print("Enter a radius of circle ");
        radius = Float.parseFloat(scan.nextLine());
        double perimeter_of_circle = (2 * radius * Math.PI);
        double area_of_circle = (Math.PI * Math.pow(radius, 2));
        System.out.println("Perimeter of circle is " + perimeter_of_circle);
        System.out.println("Area of circle is " + area_of_circle);

        System.out.println("Task 4");
        float c1, c2, c3;
        int t1, t2, t3;
        System.out.print("Enter cost 1 - ");
        c1 = Float.parseFloat(scan.nextLine());
        System.out.print("Enter cost 2 - ");
        c2 = Float.parseFloat(scan.nextLine());
        System.out.print("Enter cost 3 - ");
        c3 = Float.parseFloat(scan.nextLine());
        System.out.print("Enter time 1 - ");
        t1 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter time 2 - ");
        t2 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter time 3 - ");
        t3 = Integer.parseInt(scan.nextLine());
        System.out.println("Phone cost 1 - " + (c1*t1));
        System.out.println("Phone cost 2 - " + (c2*t2));
        System.out.println("Phone cost 3 - " + (c3*t3));
        System.out.print("All phone cost's together - " + ((c1*t1)+(c2*t2)+(c3*t3)));



    }
}
