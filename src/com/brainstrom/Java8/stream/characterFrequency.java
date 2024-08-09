package com.brainstrom.Java8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class characterFrequency {
    public static void main(String[] args) {
        String name  = "rohitroh";
        Map<String, Long> characterFrequency =Arrays
                .stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(characterFrequency);
    }
}
