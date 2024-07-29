package com.brainstrom.interview.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

public class wordFrequency {
//    static BiConsumer<String,Long> stringConsumer = (str1, str2) -> System.out.println(str1 +" "+ str2);
    public static void main(String[] args) {
        List<String> names= Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
        Map<String,Long> wordFrequency = names
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        names
//                .stream()
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .forEach(stringConsumer);
        System.out.println(wordFrequency);
    }
}
