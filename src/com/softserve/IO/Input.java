package com.softserve.IO;

import java.util.Scanner;

public class Input {

    public static int inputInt(String errorMessage){
        int result;
        Scanner input = new Scanner(System.in);
        while (true){
            try { result = Integer.parseInt(input.nextLine());
                break;
            }catch (NumberFormatException e){
                System.err.println(errorMessage);
            }
        }
        return result;
    }

    public static int inputInt(String message, String errorMessage){
        System.out.println(message);
        int result;
        Scanner input = new Scanner(System.in);
        while (true){
            try { result = Integer.parseInt(input.nextLine());
                break;
            }catch (NumberFormatException e){
                System.err.println(errorMessage);
            }
        }
        return result;
    }

    public static String inputString(String message){
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();
        return result;
    }

    public static String inputString(String message, String errorMessage, int biggerThen, int smallerThen){
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();
        while (!(result.length() >= biggerThen) || !(result.length() <= smallerThen)){
            System.err.println(errorMessage);
            result = input.nextLine();
        }
        return result;
    }

    public static double inputDouble(String errorMessage){
        double result;
        Scanner input = new Scanner(System.in);
        while (true){
            try { result = Double.parseDouble(input.nextLine().replaceAll(",", "."));
                break;
            }catch (NumberFormatException e){
                System.err.println(errorMessage);
            }
        }
        return result;
    }

    public static double inputDouble(String message, String errorMessage){
        System.out.println(message);
        double result;
        Scanner input = new Scanner(System.in);
        while (true){
            try { result = Double.parseDouble(input.nextLine().replaceAll(",", "."));
                break;
            }catch (NumberFormatException e){
                System.err.println(errorMessage);
            }
        }
        return result;
    }

}
