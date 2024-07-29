package com.brainstrom.interview.java8.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWithCount {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("AA", "BB", "AA", "CC");
        HashSet<String> set =  new HashSet<>();
        Map<String, Long> result = strList.stream()
//                .filter(duplicate -> !set.add(duplicate))
                .filter(duplicate-> Collections.frequency(strList, duplicate)>1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}
