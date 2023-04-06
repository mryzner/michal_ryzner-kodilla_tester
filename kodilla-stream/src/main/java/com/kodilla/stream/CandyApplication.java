package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class CandyApplication {
    public static void main(String[] args) {
        List<String> candiesByType = filterCandiesByType("bar");
        System.out.println(candiesByType);
        System.out.println("");
        List<String> candiesByWeight = filterCandiesByWeight(80);
        System.out.println(candiesByWeight);
    }
    public static List<String> filterCandiesByType(String type) {
        List<String> candyNames = CandyRepository.getCandiesList()
                .stream()
                .filter(candy -> candy.getType().equals(type))   //nie wiedziałem czy dać: equals czy == , oba działają
                .map(candy -> candy.getName())
                .collect(Collectors.toList());
        return candyNames;
    }
    public static List<String> filterCandiesByWeight(int weight) {
       List<String> candyNames = CandyRepository.getCandiesList()
               .stream()
               .filter(candy -> candy.getWeight() < weight)
               .map(candy -> candy.getName())
               .collect(Collectors.toList());
       return candyNames;
    }
}
