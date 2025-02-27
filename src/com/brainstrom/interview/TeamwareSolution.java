package com.brainstrom.interview;

import java.util.*;


public class TeamwareSolution {
    public static void main(String[] args) {
        //Q1
        List<String> list = Arrays.asList("A" ,"B", "A");
        Set<String> set = new HashSet<>(Arrays.asList("B","C"));
        List<String> newList = list.stream().filter(set::contains).toList();
//        newList.forEach(System.out::print);

        //Q2
        final Set<String> list1 = new HashSet<>(list);
        list1.add("C");
        System.out.println(list1);


    }
}
