package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {

       User user = new User("user1", 30, 100, "Test");

        Optional<User> optionalUser = Optional.ofNullable(user);

        String username =
                optionalUser.orElse(new User("", 0, 0, "")).getUsername();
        System.out.println("Name: " + username);
        System.out.println("");

        User user2 = null;

        Optional<User> optionalUser2 = Optional.ofNullable(user2);

        String username2 =
                optionalUser2.orElse(new User("", 0, 0, "")).getUsername();

        System.out.println("Name: " + username2);
    }
}
