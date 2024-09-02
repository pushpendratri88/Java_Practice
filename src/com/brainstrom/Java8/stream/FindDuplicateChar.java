package com.brainstrom.Java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateChar {
    public static void main(String[] args) {
        String str = "pushpendrakumartripathi";
        Set<String> uniqueSet = new HashSet<>();
        Set<String> set = Arrays.stream(str.split(""))
                .filter(ch -> !uniqueSet.add(ch))
                .collect(Collectors.toSet());
        System.out.println(set);
    }

}
