package com.brainstrom.Java8.terminal;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class StreamPartitioningByExample {
    static Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
    public static void partitioningBy_1(){
        Map<Boolean, List<Student>> partitioningGpa = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));
        System.out.println(partitioningGpa);
    }

    public static void partitioningBy_2(){
        Map<Boolean, Set<Student>> partitioningGpa = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate,toSet()));
        System.out.println(partitioningGpa);
    }
    public static void main(String[] args) {
        partitioningBy_1();
        partitioningBy_2();
    }
}
