package com.brainstrom.Java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalExample {
    static Consumer<String> consumer1 = name-> System.out.println(name.toUpperCase());
    static Consumer<String> consumer2 = number-> System.out.println(number);
    static Function<String, String >  function1 = name -> name.toUpperCase();
    static Predicate<String> predicate1 = (predicate) -> predicate.length() >= 3;
    static Function<String, String >  function2 = (name) -> {
        String[] strArray = name.split("_");
        List<String> stringList = Arrays.stream(strArray).filter(predicate1).collect(Collectors.toList());
        stringList.forEach(consumer1);
        return stringList.toString();
    };

    static Function<String, Integer >  function3 = (number) -> {
        String[] strArray = number.split(",");
        List<String> stringList = Arrays.stream(strArray).collect(Collectors.toList());
        stringList.forEach(consumer2);
        return 0;
    };

    public static void main(String[] args) {
        System.out.println(function1.apply("Pushpendra"));
        function2.apply("customer_Server");
        function3.apply("1,2,3,4,5,6,7,8,9,10");



    }
}
