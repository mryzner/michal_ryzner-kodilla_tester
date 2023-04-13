package com.kodilla.parametrized_tests;

public class StringValidator {
    public static void main(String[] args) {
        boolean res = isBlank("r");
        boolean res2 = isBlank(" ");
        boolean res3 = isBlank("");
        boolean res4 = isBlank(null);
        System.out.println(res + " " + res2 + " " + res3 + " " + res4);
    }
    public static boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }
}
