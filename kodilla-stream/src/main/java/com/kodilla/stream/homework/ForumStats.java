package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class ForumStats {
    public static void main(String[] args) {
        double UserOver40 = averageNumberOfPostsUsersAgeOver40();
        double UserBelow40 = averageNumberOfPostsUsersAgeBelow40();
        System.out.println(UserOver40);
        System.out.println(UserBelow40);

    }
    public static double averageNumberOfPostsUsersAgeOver40() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }
    public static double averageNumberOfPostsUsersAgeBelow40() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }
}
