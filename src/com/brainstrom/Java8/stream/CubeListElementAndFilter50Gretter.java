package com.brainstrom.Java8.stream;

import java.util.Arrays;
import java.util.List;

public class CubeListElementAndFilter50Gretter {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(4,5,6,7,1,2,3);
        intList
                .stream()
                .map(num -> num*num*num)
                .filter(num -> num < 50)
                .forEach(System.out::println);

    }
}
