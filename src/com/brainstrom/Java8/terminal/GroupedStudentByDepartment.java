package com.brainstrom.Java8.terminal;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class GroupedStudentByDepartment {
    static BiConsumer consumer = (k,v) -> System.out.println(k + ":" + v);
    public static void main(String[] args) {
        Map<String, Long>  map= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));
        map.forEach(consumer);
    }
}
