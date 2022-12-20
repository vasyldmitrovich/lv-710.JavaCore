package com.softserve.String;

public class StringBuilderDemo {

    public static void main(String[] args) {

        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder(100);
        stringBuilder = new java.lang.StringBuilder("rrr");
        System.out.println(stringBuilder.capacity() + "\n");

        System.out.println(stringBuilder.append(5).append(9).append("Hello").append('h').append(5.8).append(stringBuilder));
        System.out.println();

        StringBuilder stringBuilder2 = createSomeString(56, 20);
        System.out.print(stringBuilder2 + "\n");

        StringBuilder stringBuilder3 = modifySomeString(stringBuilder2, "=", "равно");
        System.out.print(stringBuilder3 + "\n");
        System.out.println("or\n");
        StringBuilder stringBuilder4 = modifySomeString1(stringBuilder2, "=", "равно");
        System.out.print(stringBuilder4 + "\n");
    }

    private static StringBuilder createSomeString(int a, int b) {
        StringBuilder stringResult = new StringBuilder();
        stringResult.append(b).append(" - ").append(a).append(" = ").append(b - a).append("\n").
                append(b).append(" + ").append(a).append(" = ").append(b + a).append("\n").
                append(b).append(" * ").append(a).append(" = ").append(b * a).append("\n");
        return stringResult;
    }

    private static StringBuilder modifySomeString(StringBuilder stringBuilder, String before, String after) {
        while (stringBuilder.indexOf(before) != -1) {
            stringBuilder.insert(stringBuilder.indexOf(before), after);
            stringBuilder.deleteCharAt(stringBuilder.indexOf(before));
        }
        return stringBuilder;
    }

    private static StringBuilder modifySomeString1(StringBuilder stringBuilder, String before, String after) {
        while (stringBuilder.indexOf(before) != -1) {
            stringBuilder.replace(stringBuilder.indexOf("="),stringBuilder.indexOf(before)+1, after);
        }
        return stringBuilder;
    }
}



