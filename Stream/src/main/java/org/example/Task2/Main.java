package org.example.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream1 = list.stream();

        //=================================

        String[] array = {"a", "b", "c"};
        Stream<String> stream2 = Stream.of(array);
        Stream<String> streamOfArrayPart = Arrays.stream(array, 1, 3);

        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();


        Stream<Double> randomStream = Stream.generate(Math::random);
        Stream<Integer> naturalNumbers = Stream.iterate(1, n -> n + 1);




    }
}
