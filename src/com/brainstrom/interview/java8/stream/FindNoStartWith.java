package com.brainstrom.interview.java8.stream;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class FindNoStartWith {
    static IntPredicate predicate = p -> String.valueOf(p).startsWith("1");
    static IntConsumer intConsumer = c -> System.out.println(c);
    public static void main(String[] args) {
        int [] intArray = new int[] {1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21};
        Arrays.stream(intArray).filter(predicate).
                        forEach(intConsumer);
    }
}
