package com.brainstrom.Java8.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {
    public static List<Integer> boxing (){
        return IntStream.rangeClosed(1,25) // it will create the stream of 25 element
                .boxed()         //all the elements will be passed one by one to get to the result as the collection.
                .collect(Collectors.toList());
    }
    public static int unBoxing(List<Integer> intList){
        return intList.stream().mapToInt(Integer ::intValue).sum();
    }
    public static void main(String[] args) {
        System.out.println(boxing());
        System.out.println(unBoxing(boxing()));
    }
}
