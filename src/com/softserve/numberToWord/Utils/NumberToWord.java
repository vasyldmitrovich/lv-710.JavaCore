package com.softserve.numberToWord.Utils;

import java.util.Random;

public class NumberToWord {
    static String[] One = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] Ten = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
            "Seventy", "Eighty", "Ninety"};

    static String[] OneUkr = {"", "один", "два", "три", "чотири", "пять", "шість", "сім", "вісім", "девять", "десять",
            "одинадцять", "дванадцять", "тринадцять", "чотирнадцять", "пятнадцять", "шістнадцять", "сімнадцять",
            "вісімнадцять", "девятнадцять", "","одна","дві"};
     static String[] TenUkr = {"", "", "двадцять", "тридцять", "сорок", "пятдесят", "шістдесят",
            "сімдесят", "вісімдесят", "девяносто"};
    static String[] HundredUkr = {"", "сто", "двісті", "триста", "чотириста", "пятсот", "шістсот",
            "сімсот", "вісімсот", "девятсот"};
    private static boolean female = false;

    public static void run() {
        int num;
        for (int i = 0; i < 20; i++) {
            female = false;
            num = (new Random()).ints(0, 999999999).findFirst().getAsInt();
            System.out.println(num + " = " + numberToWordsUkr(num));
            double grn = num/100;
            double kop = (num%100)*100;
            System.out.println(grn+" "+kop);

            System.out.println(grn + " = " + numberToWordsUkr((int)grn) + " грн. "+
                                            numberToWordsUkr((int)kop) + " коп. ");

        }
        System.out.println();
    }

    private static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return helper(num);
    }

    public static String numberToWordsUkr(int num) {
        if (num == 0) {
            return "нуль";
        }
        return helperUkr(num);
    }

    private static String helper(int num) {
        if (num >= 1000000) {
            return (helper(num / 1000000) + " Million " + helper(num % 1000000)).trim();
        }
        if (num >= 1000) {
            return (helper(num / 1000) + " Thousand " + helper(num % 1000)).trim();
        }
        if (num >= 100) {
            return (helper(num / 100) + " Hundred " + helper(num % 100)).trim();
        }
        if (num >= 20) {
            return (Ten[num / 10] + " " + helper(num % 10)).trim();
        }
        return One[num];
    }

    private static String milPref(int num) {
        switch (num) {
            case 2:
            case 4:
            case 3:
                return "и";
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                return "ів";
            default:
                return "";

        }
    }

    private static String tisPref(int num) {
        switch (num) {
            case 1:
                return "а";
            case 2:
            case 3:
            case 4:
                return "і";
            default:
                return "";
        }
    }

    private static String helperUkr(int num, boolean f) {
        female = f;
        return helperUkr(num);
    }

    private static String helperUkr(int num) {
        if (num >= 1000000) {
            return (helperUkr(num / 1000000) + " мільйон" + milPref(
                    ((num / 1000000) % 100 < 10 || (num / 1000000) % 100 > 20) ? (num / 1000000) % 10 : 0
            ) + " " + helperUkr(num % 1000000, true)).trim();
        }
        if (num >= 1000) {
            return (helperUkr(num / 1000) + " тисяч" +
                    tisPref(
                            ((num / 1000) % 100 < 10 || (num / 1000) % 100 > 20) ? (num / 1000) % 10 : 0
                    ) + " "
                    + helperUkr(num % 1000)).trim();
        }
        if (num >= 100) {
            return (HundredUkr[num / 100] + " " + helperUkr(num % 100)).trim();
        }
        if (num >= 20) {
            return (TenUkr[num / 10] + " " + helperUkr(num % 10)).trim();
        } else {
            if (female) {
                return (num<3)?OneUkr[num+20]:OneUkr[num];
            } else return OneUkr[num];
        }
    }
}

