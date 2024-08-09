package com.brainstrom.Java8.stream;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class FindEvenNo {
    static IntConsumer intCustomer = str -> System.out.println(str);
    public static void main(String[] args) {
        int[] intArray = new int[] {10,15,8,49,25,98,32};
        Arrays
                .stream(intArray)
                .filter(evenCheck -> evenCheck % 2 == 0)
                .forEach(intCustomer);
    }
}
