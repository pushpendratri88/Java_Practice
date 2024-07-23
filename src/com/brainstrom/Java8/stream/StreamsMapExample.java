package com.brainstrom.Java8.stream;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamsMapExample {
    static Consumer<String> cust = p -> System.out.println(p);
       private static List<String> nameUpperCase(List<Student> students) {
       List<String> stringList =  students.stream() //stream<<Student>
                .map(Student :: getName) // Transform to Stream<String>
                .map(String :: toUpperCase)
                .collect(Collectors.toList()); //return List
       return stringList;
    }
    private static Set<String> nameSetUpperCase(List<Student> students) {
        Set<String> stringSet =  students.stream() //stream<<Student>
                .map(Student :: getName) // Transform to Stream<String>
                .map(String :: toUpperCase)
                .collect(Collectors.toSet()); //return Set
        return stringSet;
    }

    public static void main(String[] args) {
//      System.out.println("Name Upper Case : " + nameUpperCase(StudentDataBase.getAllStudents()));
        System.out.println("Name Upper Case : ");
        nameUpperCase(StudentDataBase.getAllStudents()).forEach(cust);

//        System.out.println("Set Name Upper Case : " + nameSetUpperCase(StudentDataBase.getAllStudents()));
        System.out.println("Set Name Upper Case : ");
        nameSetUpperCase(StudentDataBase.getAllStudents()).forEach(cust);
    }
}
