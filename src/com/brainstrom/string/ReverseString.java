package com.brainstrom.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Pushpendra";
        char ch;
        String reverseString = "";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            ch = charArray[i];

            reverseString = ch + reverseString;
        }

        System.out.println(reverseString);
    }
}
