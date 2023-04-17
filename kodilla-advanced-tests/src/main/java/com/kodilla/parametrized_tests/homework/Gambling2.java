package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Gambling2 {
    public static void main(String[] args) throws InvalidNumbersException {
        Set<Integer> result = generateComputerNumbers();
        System.out.println(result);
        /*Set<Integer> res = new HashSet<>();
        res.add(0);
        res.add(50);
        howManyWins(res);*/
        int result2 = howManyWins(result);
        System.out.println("2: " + result2);

    }
    public static int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    public static void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            throw new InvalidNumbersException();
        }
    }

    private static boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) {
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 49);
    }

    private static boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }

    private static Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }
}
