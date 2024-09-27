//Tech Mahindra
//longest common prefix string amongst an array of strings.
//
//        Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

package com.brainstrom.interview;

import java.util.Arrays;

public class FindCommonCharFromString {
    public static void main(String[] args) {
        String[] inputArray = { "flower","flow","flight"};
        System.out.println(Arrays.toString(findCommonString(inputArray)));
    }

    private static Character[] findCommonString(String[] inputArray) {
        int char1 = 0, store = 0;
        
        Character[] charString  = new Character[inputArray[0].length()];
        for(int i = 0; i < inputArray.length;i++){
            Character stringChar =  inputArray[i].charAt(char1);
            for(int j = i+1; j < inputArray.length;j++){
                while(stringChar.equals(inputArray[j].charAt(char1))){
                    charString[store++] = stringChar;
                    char1++;
                }
            }
        }
        return charString;
    }
}
