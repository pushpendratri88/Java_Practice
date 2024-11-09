package com.brainstrom.practice;


import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
     String input  = "Pushpendra";
        System.out.println(Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
    }
}
