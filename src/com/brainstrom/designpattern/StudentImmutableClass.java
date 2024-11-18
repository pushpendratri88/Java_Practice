package com.brainstrom.designpattern;

import java.util.HashMap;
import java.util.Map;

final class StudentImmutableClass {
    private final int studentId;
    private final String name;
    private final Map<String, String> map;


    public StudentImmutableClass(int studentId, String name, Map<String, String> map) {
        this.studentId = studentId;
        this.name = name;
        Map<String,String> tempMap = new HashMap<>();

        map.forEach((k,v)-> {
            tempMap.put(k,v);
        });
        this.map = tempMap;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getMap() {
        Map<String,String> tempMap = new HashMap<>();

        map.forEach((k,v)-> {
            tempMap.put(k,v);
        });
        return tempMap;
    }
}
