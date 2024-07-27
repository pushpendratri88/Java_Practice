package com.brainstrom.interview.java8.stream;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class FindNoStartWith_1 {
    static IntConsumer intCustomer = str -> System.out.println(str);
    public static void main(String[] args) {
        int[] intArray = new int[]{1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21};
        Arrays.stream(intArray).filter(i -> Integer.toString(i).startsWith("2")).forEach(intCustomer);
    }
}
