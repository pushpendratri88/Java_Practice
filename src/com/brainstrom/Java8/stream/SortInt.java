package com.brainstrom.Java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SortInt {
    static Consumer<Integer> intCustomer = str -> System.out.println(str);
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        intList
                .stream()
                .sorted()
                .forEach(intCustomer);


    }
}
