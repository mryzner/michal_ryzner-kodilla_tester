package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 8;
        double b = 5;
        double sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult, 0.01);
        if (correct) { System.out.println("Metoda sum działa poprawnie dla: " + a + " i " + b); }
        else { System.out.println("Metoda sum nie działa poprawnie dla: " + a + " i " + b); }

        double subtractResult = calculator.subtract(a, b);
        boolean correct2 = ResultChecker.assertEquals(3, subtractResult, 0.01);
        if (correct2) { System.out.println("Metoda subtract działa poprawnie dla: " + a + " i " + b); }
        else { System.out.println("Metoda subtract nie działa poprawnie dla: " + a + " i " + b); }

        double powerResult = calculator.power(a);
        boolean correct3 = ResultChecker.assertEquals(64, powerResult, 0.01);
        if (correct3) { System.out.println("Metoda power działa poprawnie dla: " + a); }
        else { System.out.println("Metoda power nie działa poprawnie dla: " + a); }
    }
}
