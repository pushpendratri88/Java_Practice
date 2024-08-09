package com.brainstrom.Java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> SortDescList = intList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(SortDescList);
    }
}
