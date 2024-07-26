package com.brainstrom.interview.java8.stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMax {
    public static void main(String[] args) {
        int [] intArray = new int[]{10,15,8,49,25,98,98,32,15};
        OptionalInt max = Arrays.stream(intArray).max();
        System.out.println(max.getAsInt());
    }
}
