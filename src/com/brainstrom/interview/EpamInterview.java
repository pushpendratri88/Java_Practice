//String[] inputArray = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };
//expected output
//
//"epam", "pame", "aepm"
//
//"abcd" "dcba"
//
//"java" "ajav"

package com.brainstrom.interview;

import java.util.Arrays;

public class EpamInterview {
    public static void main(String[] args) {
        String[] inputArray = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };

        System.out.println(Arrays.toString(getmatchingAnagramString(inputArray)));
    }

    private static String[] getmatchingAnagramString(String[] inputArray){
        String[] anagramSortedArray = new String[inputArray.length];
        int count = 0;
        for(int i=0;i<inputArray.length;i++){
            for(int j=i+1;j<inputArray.length-1;j++){
                char[] charArray1 = inputArray[i].toCharArray();
                char[] charArray2 = inputArray[j].toCharArray();
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);
                boolean flag= true;
                for(int k=0;k<charArray1.length;k++){
                    if(charArray1[k] != charArray2[k]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    anagramSortedArray[count++]= inputArray[i];
                    anagramSortedArray[count++]= inputArray[j];
                }
            }
        }
        return Arrays.copyOf(anagramSortedArray,count);
    }
}
