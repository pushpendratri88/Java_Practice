package com.brainstrom.test;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
    String str = "pushpendrakumartripathi";
        System.out.println(firstNonRepeatedChar(str));
    }
    public static char firstNonRepeatedChar(String str) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] chArray = str.toCharArray();
        for(char ch : chArray){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }
        return ' ';
    }
}
