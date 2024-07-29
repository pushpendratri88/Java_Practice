package com.brainstrom.interview.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class separationOfEvenOddNumber {
    public static void main(String[] args) {
        separationOfEvenOddNumberInMap();
        separationOfEvenOddNumberInList();
    }
    public static void separationOfEvenOddNumberInMap(){
        List<Integer> oneToTen = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean,List<Integer>> evenAndOddSepration = oneToTen
                .stream()
                .collect(Collectors.partitioningBy(num -> num%2 ==0));
        System.out.println(evenAndOddSepration);
    }

    public static void separationOfEvenOddNumberInList(){
        List<Integer> oneToTen = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collection<List<Integer>> evenAndOddSepration = oneToTen
                .stream()
                .collect(Collectors.collectingAndThen(Collectors.groupingBy(num -> num%2 == 0),Map :: values));
        System.out.println(evenAndOddSepration);
    }
}
