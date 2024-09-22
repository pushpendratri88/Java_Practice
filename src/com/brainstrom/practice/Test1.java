package com.brainstrom.practice;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        BiConsumer biConsumer = (k,v) -> System.out.println(k +"::" + v);
        Map<Character, List<String>> studentGroup = StudentDataBase.getAllStudents().stream().map(Student :: getName).collect(Collectors.groupingBy(name -> name.charAt(0)));
        studentGroup.forEach(biConsumer);
    }
}
