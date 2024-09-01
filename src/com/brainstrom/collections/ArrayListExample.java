package com.brainstrom.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List list =  new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add(1,"4");
        System.out.println(list);
    }
}
