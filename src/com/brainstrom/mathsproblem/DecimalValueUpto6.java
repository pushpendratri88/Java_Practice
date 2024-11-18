package com.brainstrom.mathsproblem;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class DecimalValueUpto6 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,1,0,-1,-1);
        double positiveNumberCount = 0;
        double nagativeNumberCount = 0;
        double zeroCount = 0;
        double listSize =   Double.valueOf(arr.size());
        for(Integer num : arr){
            if(num < 0){
                nagativeNumberCount++;
            }
            else if(num > 0){
                positiveNumberCount++;
            }
            else{
                zeroCount++;
            }
        }
        DecimalFormat fm = new DecimalFormat("#.######");
        System.out.println(String.format("%.6f", positiveNumberCount/listSize));
        System.out.println(String.format("%.6f",nagativeNumberCount/listSize));
        System.out.println(String.format("%.6f",zeroCount/listSize));
    }
}
