package com.kodilla.parametrized_tests;

public class StringManipulator {
    public static void main(String[] args) {
        String result = reverseWithLowerCase("AwAk  arBod ozdRAb");
        int result2 = getStringLengthWithoutSpaces(result);
        System.out.println(result + " " + result2);
        int result3 = countNumberOfCommas("to, nie, jest, proste");
        System.out.println(result3);
    }

    public static String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }
    public static int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        // System.out.println(value);
        return value.length();
    }
    public static int countNumberOfCommas(String text) {
        int count = text.length() - text.replace(",", "").length();
        return count;
    }
    public static String something(String text) {
        String result = text.replace(",", "");
        return result;
    }
}
