package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;
    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
        System.out.println(firstName + " " + age);
    }
    private static void processPerson1() {
        Driver driver = new Driver();
        Person person1 = new Person("Adam", 30, driver);
        System.out.println("Responsibilities: " + driver.getResponsibilities());
        System.out.println(" ");
    }
    private static void processPerson2() {
        Builder builder = new Builder();
        Person person2 = new Person("Bob", 35, builder);
        System.out.println("Responsibilities: " + builder.getResponsibilities());
        System.out.println(" ");
    }
    private static void processPerson3() {
        Writer writer = new Writer();
        Person person3 = new Person("Jan", 40, writer);
        System.out.println("Responsibilities: " + writer.getResponsibilities());
    }

    public static void main(String[] args) {
        processPerson1();
        processPerson2();
        processPerson3();
    }
}
