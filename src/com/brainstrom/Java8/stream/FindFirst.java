package com.brainstrom.Java8.stream;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> intList =  Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer intt = intList.stream().findFirst().get();
        System.out.println(intt);
    }
}
