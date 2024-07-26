package com.brainstrom.interview.java8.stream;

import java.util.Arrays;
import java.util.List;

public class MapAndUpperCase {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("pushpendra","tripathi","nandita");
        stringList.stream().map(String ::toUpperCase).forEach(upper -> System.out.println(upper));
    }
}
