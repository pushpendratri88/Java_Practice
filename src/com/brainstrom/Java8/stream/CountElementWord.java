package com.brainstrom.Java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountElementWord {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> map = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
