//Two Inputs and No Output: The BiConsumer interface has a single abstract method, accept, which takes two arguments and returns nothing (void):

package com.brainstrom.Java8.functionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b) -> {
            System.out.println("a : "+a+ " b :" +b);
        };
        biConsumer.accept("Welcome","Java8");

        BiConsumer<Integer,Integer> addition = (a,b) -> {
            System.out.println("addition : "+ (a+b));
        };
        addition.accept(1,5);

        BiConsumer<Integer,Integer> multiply= (a,b) -> {
            System.out.println("Multiplication : "+ (a*b));
        };
        multiply.accept(4,5);

        BiConsumer<Integer,Integer> division= (a,b) -> {
            System.out.println("division : "+ (a/b));
        };
        division.accept(9,3);
    }
}
