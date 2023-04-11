package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = false;
        try {
            isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isViennaInUse);
        }
        catch (AirportNotFoundException e) {
            //throw new RuntimeException(e);                   //1   różne procedury obsługi błędu
            //e.printStackTrace();                           //2
            System.out.println("Sorry, no such airport");  //3
        }
        finally {
            System.out.println("Thank you for using Kodilla Airlines");
        }
    }
}
