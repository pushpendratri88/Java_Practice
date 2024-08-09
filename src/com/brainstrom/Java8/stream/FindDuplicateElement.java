package com.brainstrom.Java8.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FindDuplicateElement {

    static Consumer<Integer> intCustomer = str -> System.out.println(str);
    public static void main(String[] args) {
        List<Integer> duplicatList = Arrays.asList(1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21);
        Set<Integer> uniqueList = new HashSet<>();
        duplicatList
                .stream()
                .filter(num -> !uniqueList.add(num))
                .collect(Collectors.toSet())
                .stream()
                .sorted()
                .forEach(intCustomer);
    }
}
