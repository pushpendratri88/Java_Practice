package com.brainstrom.mathsproblem;

import java.util.Arrays;


public class AnagramCheck {
    public static void main(String[] args) {
        char[] charArray1 = new char[] { 't', 'e', 's', 't'};
        char[] charArray2 = new char[] {'t', 'e', 't', 's'};
        System.out.println(areAnagram(charArray1,charArray2));
        areAnagram(charArray1,charArray2);
    }

    public static boolean areAnagram(char[] str1,char[] str2){
        if(str1.length != str2.length){
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i = 0; i < str1.length; i++){
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
}
