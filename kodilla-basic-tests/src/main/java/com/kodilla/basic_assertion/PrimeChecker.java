package com.kodilla.basic_assertion;

import java.sql.SQLOutput;

public class PrimeChecker {
    private int count; // w celu wyświetlenia numeru testu w PrimeCheckerTestSuite
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    public int getCount() {
        return count;
    }

    public void incrementCount() {
        this.count++;
    }

    public static void main(String[] args) {
        boolean result = isPrime(568987);
        System.out.println("Czy liczba jest liczbą pierwszą: " + result);
    }
}
