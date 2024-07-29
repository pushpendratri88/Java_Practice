package com.brainstrom.interview.java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class NumberDuplicationCheck {
    public static void main(String[] args) {
        System.out.println(duplicateCheck());
    }
    private static boolean duplicateCheck(){
        List<Integer> intList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet unique = new HashSet<>();
        List<Integer> duplicateList = intList
                .stream()
                .filter(num -> !unique.add(num))
                .collect(Collectors.toList());
        if(!duplicateList.isEmpty()){
            return true;
        }
        return  false;
    }
}
