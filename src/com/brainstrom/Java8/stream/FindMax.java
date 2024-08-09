package com.brainstrom.Java8.stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMax {
    public static void main(String[] args) {
        int [] intArray = new int[]{10,15,8,49,25,98,98,32,15};
        OptionalInt max = Arrays.stream(intArray).max();
        System.out.println("Max :"+max.getAsInt());

        OptionalInt min = Arrays.stream(intArray).min();
        System.out.println("Min :"+min.getAsInt());
    }
}
