package com.kodilla.parametrized_tests.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public static void main(String[] args) {
        boolean result = validateEmail("");
        System.out.println(result);
        boolean result2 = validateUsername("usr-1");
        System.out.println("user: " + result2);
    }
    public static boolean validateUsername(String username) {

        return username.matches("^[a-zA-Z0-9._-]{3,}$");
    }
    public static boolean validateEmail(String email) {
        if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }
}
