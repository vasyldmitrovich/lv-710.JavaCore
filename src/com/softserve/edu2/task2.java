import java.util.Scanner;

public class task2 {
    public static void quest(String[] args){
        System.out.println("Hi, what's your name ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Whats your address?");
        Scanner dc = new Scanner(System.in);
        String ad = sc.nextLine();
        System.out.println("Your name is - "+ name + "\n Your address is - "+ ad);
    }
}
