package org.example.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();
        String str = "value";
        optional = Optional.of(str);
        String result = optional.get();
        String orElse = optional.orElse("Hello!");

        String value = null;
        Optional<String> valueOpt = Optional.ofNullable(value);
        String result2 = valueOpt.orElseThrow(NullPointerException::new).toUpperCase();


    }

}
