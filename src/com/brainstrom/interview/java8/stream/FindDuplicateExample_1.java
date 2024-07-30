package com.brainstrom.interview.java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateExample_1 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> uniqueList  = new HashSet<>();
        intList.stream().filter(duplicate -> !uniqueList.add(duplicate)).forEach(p -> System.out.println(p));
    }
}
