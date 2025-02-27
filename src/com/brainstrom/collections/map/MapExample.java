package com.brainstrom.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map =  new HashMap<>();
        map.put("India",14000000);
        map.put("China",1000000);
        map.put("UK",100000);
        map.put("US",50000);
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println("Key : "+e.getKey() + " | Value : " + e.getValue());
        }









    }
}
