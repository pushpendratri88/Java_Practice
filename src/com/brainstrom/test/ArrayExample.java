//Tech Mahindra
//String[] inputArray = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };
//
//expected output
//
//
//"epam", "pame", "aepm"
//
//        "abcd" "dcba"
//
//        "java" "ajav"




package com.brainstrom.test;

import java.util.Arrays;

public class ArrayExample{
    public static void main(String[] args) {
        String[] inputArray = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm"};
        findAnagram(inputArray);

    }

    private static void findAnagram(String[] inputArray) {
        String[] resultArray = new String[]{};
        for (int i= 0; i < inputArray.length; i++){
            char[] stringChar = inputArray[i].toCharArray();
            Arrays.sort(stringChar);
            for (int j= i+1; j < inputArray.length; j++){
                int charPosition = 0;
                char[] stringChar1 = inputArray[j].toCharArray();
                Arrays.sort(stringChar1);
                    while(stringChar[charPosition] == stringChar1[charPosition]){
                        if(charPosition < stringChar.length-1){
                        System.out.println(stringChar1);
                        charPosition++;
                        }
                    }


            }
        }
    }
}
