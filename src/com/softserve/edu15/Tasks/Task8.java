package com.softserve.edu15.Tasks;

public class Task8 {
    static String[] One = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven","Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] Ten = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
            "Seventy", "Eighty", "Ninety"};
    public static void run(){
        System.out.println(1234567+" = "+numberToWords(1234567));
    }
    private static String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        return helper(num);
    }
    private static String helper(int num){
        if(num >= 1000000){
            return (helper(num / 1000000) + " Million " + helper(num % 1000000)).trim();
        }
        if(num >= 1000){
            return (helper(num / 1000) + " Thousand " + helper(num % 1000)).trim();
        }
        if(num >= 100){
            return (helper(num / 100) + " Hundred " + helper(num % 100)).trim();
        }
        if(num >= 20){
            return (Ten [num / 10] + " " + helper (num % 10)).trim();
        }
        return One[num];
    }
}
