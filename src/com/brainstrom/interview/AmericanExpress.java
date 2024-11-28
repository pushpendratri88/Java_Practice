package com.brainstrom.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AmericanExpress {
    public static void main(String[] args) {
        String[] StringArray = {"a","a","b","b","b","c","c","c","c"};
        String[] resArray = StringCount(StringArray);
        System.out.println(Arrays.toString(resArray));
    }

    private static String[] StringCount(String[] StringArray) {
        String[] resultString = new String[StringArray.length];
        Map<String, Integer> StringMap = new HashMap<>();
        for(String ch : StringArray){
            StringMap.put(ch,StringMap.getOrDefault(ch,0)+1);
        }
        int i = 0;
        for(Map.Entry<String,Integer> map : StringMap.entrySet()){
            resultString[i++] = map.getKey();
            resultString[i++] = String.valueOf(map.getValue());
        }
        return Arrays.copyOf(resultString,i);
    }
}
