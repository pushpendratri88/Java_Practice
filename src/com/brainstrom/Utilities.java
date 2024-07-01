package com.brainstrom;

import java.util.Arrays;

public class Utilities {

    public void findNoStartWith1(){
        int[] intArray = new int[] {1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21};
        Arrays.stream(intArray)
                .filter(num -> Integer.toString(num).startsWith("1")).forEach(value -> System.out.println(value));
    }

}
