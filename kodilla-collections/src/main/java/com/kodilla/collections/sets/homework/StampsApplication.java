package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Ugly stamp", 4, 3, true));
        stamps.add(new Stamp("Old stamp", 5, 4, false));
        stamps.add(new Stamp("Nice stamp", 3, 4, true));
        stamps.add(new Stamp("Old stamp", 5, 4, false));
        stamps.add(new Stamp("Lovely stamp", 6, 2, false));
        stamps.add(new Stamp("Valuable stamp", 5, 4, true));

        System.out.println("Size: " + stamps.size());
        int count = 0;
        for (Stamp stamp: stamps) {
            count++;
                                             /*if (stamps.size() != 5) {
                                             throw new Exception();
                                             }*/
            System.out.println(count);
            System.out.println(stamp);
        }
    }
}
