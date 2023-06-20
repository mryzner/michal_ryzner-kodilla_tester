package com.kodilla.jacoco;

public class Year {
    int yearExample;

    public Year(int year) {

        this.yearExample = year;
    }

    public boolean isLeap() {
        return ((this.yearExample % 400 == 0)
                || ((this.yearExample % 4 == 0)
                && (this.yearExample % 100 != 0)));
    }
}
