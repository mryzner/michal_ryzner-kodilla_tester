package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager2 {
    public static void main(String[] args) {
        processUsersStream();
        processUsersStream2();
        processUsersStream3();
        processUsersStream4();
    }
    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .map(user -> user.getUsername())
                .forEach(username -> System.out.println(username));
        System.out.println("");
    }
    private static void processUsersStream2() {
        UsersRepository.getUsersList()
                .stream()
                .map(UsersManager2::getUserName)
                .forEach(username -> System.out.println(username));
        System.out.println("");
    }
    private static void processUsersStream3() {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager2::getUserName)
                .forEach(userName -> System.out.println(userName));
        System.out.println("");
    }
    private static void processUsersStream4() {
        UsersRepository.getUsersList().stream().map(user -> user.getAge()).forEach(userAge -> System.out.println(userAge));
        System.out.println("");
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }
}
