package com.brainstrom.mathsProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Long> arr = Arrays.asList(396285104L,573261094L,759641832L,819230764L,364801279L);
        Long minValue = 0L;
        Long maxValue = 0L;
        // Write your code here
        Collections.sort(arr);
        for(int i=0; i < arr.size()-1; i++){
            minValue = minValue + arr.get(i);
        }
        for(int i=1; i < arr.size(); i++){
            maxValue =  maxValue + arr.get(i);

        }

        System.out.println(minValue + " " + maxValue);
    }
}
