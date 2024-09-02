package com.brainstrom.Java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class characterFrequency {
    public static void main(String[] args) {
        BiConsumer<String,Long> consumer = (k, v) -> System.out.println(k+ "::" + v);
        String name  = "rohitroh";
        Map<String, Long> characterFrequency =Arrays
                .stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(characterFrequency);


        String nameFreq = "pushpendrakumartripathi";
        Map<String,Long> map = Arrays.stream(nameFreq.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach(consumer);


    }

}
