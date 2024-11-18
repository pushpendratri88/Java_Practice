package com.brainstrom.designpattern;

import java.util.HashMap;
import java.util.Map;

public class StudentImmutableClassTest {
    public static void main(String[] args) {
        Map<String, String> map= new HashMap<>();
        map.put("1", "first");
        map.put("2","second");

        StudentImmutableClass stu = new StudentImmutableClass(101,"Pushpendra",map);
        System.out.println("StudentId :" + stu.getStudentId());
        System.out.println("StudentName :" + stu.getName());
        System.out.println("StudentMap :"+stu.getMap());
        map.put("3", "Pushpendra");
        System.out.println("=================================================");
        System.out.println("StudentId :" + stu.getStudentId());
        System.out.println("StudentName :" + stu.getName());
        System.out.println("StudentMap :"+stu.getMap());

    }
}
