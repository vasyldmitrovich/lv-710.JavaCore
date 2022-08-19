import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Task1 {

    public static void main(String[] args) throws IOException {
        System.out.println("What is your name?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("Where you live?");
        String adress = br.readLine();
        System.out.println("Your name is " + name);
        System.out.println("Your adress is " + adress);

//        System.out.print("напишіть радіус ");
//        Scanner scan = new Scanner(System.in);
//        int r = scan.nextInt();
//        int l = (int) (2.0 * r * Math.PI);
//        int s = (int) (Math.PI * Math.pow(r, 2));
//        System.out.println ("Довжина окружності квітника " + l);
//        System.out.println ("Площа квітника " + s);
    }
}


