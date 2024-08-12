package com.brainstrom.interview;

public class StringImmutabilityCheck {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = str;
        str = str +" world";

        System.out.println(str);
        System.out.println(str1);
    }
}
