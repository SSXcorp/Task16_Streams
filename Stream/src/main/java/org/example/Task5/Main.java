package org.example.Task5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users= new ArrayList<>();
        fillList(users);

        Stream<User> stream = users.stream()
                .sorted((user1, user2) -> user1.getName().compareTo(user2.getName()))
                .filter(user -> user.getAge() > 25)
                .limit(3);

        stream.forEach((user -> System.out.println("User :" + user.getName())));

            //==================================================================================

        Boolean checkAnyUserLessThan18 = users.stream()
                .anyMatch(user -> user.getAge() < 18);

        Boolean checkNameBiggerThanOneChar = users.stream()
                .allMatch(user -> user.getName().length() > 0);

        Boolean checkUserAgeMore80 = users.stream()
                .noneMatch(user -> user.getAge() > 80);

        users.stream()
                .min(Comparator.comparingInt(User::getAge))
                .ifPresent(user -> System.out.println("Min user: " + user.getName() + ", Age: " + user.getAge()));

        users.stream()
                .max(Comparator.comparingInt(User::getAge))
                .ifPresent(user -> System.out.println("Max user: " + user.getName() + ", Age: " + user.getAge()));

        long countUsersAge18 = users.stream()
                .filter(user -> user.getAge() == 18)
                .count();

        Map<Boolean, List<User>> usersByAgeGroup = users.stream()
                .collect(Collectors.partitioningBy(user -> user.getAge() < 18));

        ArrayList<User> users2 = (ArrayList<User>) users.stream()
                .distinct().collect(Collectors.toList());

    }

    static List<User> fillList(List<User> list) {
        list.add(new User("Oleg", "Ragul", 22, Male.MALE));
        list.add(new User("Alex", "Messi", 10, Male.MALE));
        list.add(new User("John", "Crown", 42, Male.MALE));
        list.add(new User("Kim", "Vedz", 51, Male.MALE));
        list.add(new User("Karina", "Pepco", 33, Male.FEMALE));
        list.add(new User("Viktor", "Trasck", 11, Male.MALE));
        list.add(new User("Bohdan", "Copiil", 14, Male.MALE));
        list.add(new User("Jorge", "Fagrat", 93, Male.MALE));
        list.add(new User("Olya", "Klis", 66, Male.FEMALE));
        list.add(new User("Olena", "Olov", 38, Male.FEMALE));
        list.add(new User("Devil", "Devil", 666, Male.OTHER));
        return list;
    }
}
