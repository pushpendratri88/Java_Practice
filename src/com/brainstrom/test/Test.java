package com.brainstrom.test;

import com.brainstrom.data.Employee1;
import java.util.*;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {
       int[] names = {7,3,5,40,25,12};
       int s = Arrays.stream(names) // Convert array to IntStream
                .distinct() // Remove duplicates
                .boxed() // Convert to Stream<Integer> to use sorting with Comparator
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1) // Skip the highest element
                .findFirst() // Get the second highest
                .orElseThrow(() -> new IllegalArgumentException("No second highest element found."));
        System.out.println(s);

    }
}
