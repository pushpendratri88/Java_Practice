//Write a Java program to find the longest substring without repeating characters in a given string.
// Implement a method findLongestUniqueSubstring(String input) that returns the longest substring where each character appears only once.
// If there are multiple substrings of the same maximum length, return the first one.
//        Examples:
//Input: "abcabcbb"
//Output: "abc"
//Input: "bbbbb"
//Output: "b"
//Input: "pwwkew"
//Output: "wke"

package com.brainstrom.interview;
import java.util.Arrays;

public class EdelmanFinancialEnginesII {
    public static void main(String[] args) {
        String input = "bbbbb";
        System.out.println(longestSubString(input));
    }

    private static String longestSubString(String input) {
        String[] longestStringArray = new String[20];
        int longestStringArrayCount = 0;
        String subString = "";
        String longestSubString ="";
        char[] charArray = input.toCharArray();
        for(char ch : charArray){
            if(!subString.contains(""+ch)){
                subString = subString + ch;
            }else{
                longestStringArray[longestStringArrayCount++] = subString;
                subString = ""+ch;
            }
        }
        longestStringArray = Arrays.copyOf(longestStringArray,longestStringArrayCount);
        for (int i=0;i<longestStringArray.length;i++){
            if(longestSubString.length() < longestStringArray[i].length()){
                longestSubString = longestStringArray[i];
            }
        }
        return longestSubString;
    }
}
