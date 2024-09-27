package com.brainstrom.Java8.terminal;


import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class GroupedStudentByFirstLetter {
    public static void main(String[] args) {
        BiConsumer<Character,List<String>> consumer = (k,v) -> System.out.println(k + " :" + v);
        Map<Character, List<String>>  groupedStudent =StudentDataBase.getAllStudents()
                .stream()
                .map(Student :: getName)
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        groupedStudent.forEach(consumer);
        // other way
        groupedStudent.forEach((i,j) -> System.out.println(i + "::" +j));
    }
}
