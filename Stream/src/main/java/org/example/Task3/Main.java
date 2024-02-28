package org.example.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Intermediate operation - returns stream
        Stream<String> onceModifiedStream = Stream.of("abcd", "bbcd", "cbcd").skip(1);


        //Terminal operation - returns object | 1 for one stream!!!

        List<String> list = Arrays.asList("abc1", "abc2", "abc3", "abc0");
        long size = list.stream().skip(1)
                .map(element -> element.substring(0, 3)).sorted().count();
        System.out.println("Size : " + size);

    }
}
