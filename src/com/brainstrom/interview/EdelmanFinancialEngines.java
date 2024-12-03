//Check if the given integer array is balanced or not.
//Input is an array with +ve and -ve numbers. 
//For every positive number there should be a corresponding matching negative number. 
//Zeroes can be ignored. 
//There can be duplicate numbers in the array.
//
//Examples:
//
//Balanced Array :- {1, 0, -3, 0,-1, 3, 0}
//Balanced Array :- {5, 0, 1,-1, 3, -5, -3, 0}
//Not Balanced Array :- {1,-1, 3, 7, 0, -7} Explanation : -3 is missing
//Not Balanced Array :- {1, 2, -3}
//Not Balanced Array :- {1, 1, -1}
//Balanced Array :- {1, 1, -1, -1}



package com.brainstrom.interview;

import java.util.HashMap;
import java.util.Map;

public class EdelmanFinancialEngines {
    public static void main(String[] args) {
        int[] intArray = {1, 1, -1};
        System.out.println(isBalanced(intArray));
    }

    private static boolean isBalanced(int[] intArray) {
        boolean isBalance= true;
        int numSum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : intArray){
            if(num !=0){
                int key = Math.abs(num);
                int value = Math.abs(map.getOrDefault(key,0)+1);
                map.put(key, value);
            }
        }
        for(int num : map.values()){
            if(num %2 != 0){
                isBalance = false;
            }
        }
        return isBalance;
    }
}
