package com.kodilla.execution_model;

import com.kodilla.notification.Client;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvoiceApplication {
    public static void main(String[] args) {
        //Date date = new Date();
        //System.out.println(date);
        LocalDate today = LocalDate.now();
        LocalDate example = LocalDate.of(2021, 11, 25);
        LocalDate example2 = LocalDate.of(2022, 11, 10);
        Period period = Period.between(example, example2);
        //LocalDate whenCreated = LocalDate.of(2021, Month.FEBRUARY, 22);
        LocalDate fromString = LocalDate.parse("2021-02-22");
        System.out.println("Period: " + period);
        Pattern compiledPattern = Pattern.compile("Marcin");
        Matcher matcher = compiledPattern.matcher("Nazywam sie Marcin Pietraszek");

        System.out.println(matcher.find());
        System.out.println(matcher.matches());


        /*LocalTime now = LocalTime.now();
        LocalTime whenWritten = LocalTime.of(22, 12);
        LocalTime timeFromString = LocalTime.parse("22:12:23");
        System.out.println(whenWritten); // 22:12*/
    }
}
