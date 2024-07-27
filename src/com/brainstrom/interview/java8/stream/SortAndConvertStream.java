package com.brainstrom.interview.java8.stream;

import java.util.Arrays;

public class SortAndConvertStream {
    public static void main(String[] args) {
        int[] intArray = new int[] { 99, 55, 203, 99, 4, 91};
        Arrays.stream(intArray).forEach(num -> System.out.println(num));
        Arrays.parallelSort(intArray);
        Arrays.stream(intArray).forEach(num -> System.out.println(num));
    }
}
