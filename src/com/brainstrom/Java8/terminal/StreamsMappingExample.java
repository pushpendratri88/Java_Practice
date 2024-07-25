package com.brainstrom.Java8.terminal;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMappingExample  {


    public static void main(String[] args) {
        List<String> studentList = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println(studentList);

        List<String> studentSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println(studentSet);
    }
}
