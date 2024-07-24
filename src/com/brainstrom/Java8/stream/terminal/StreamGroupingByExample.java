package com.brainstrom.Java8.stream.terminal;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {
    public static void  groupingByGender(){
        Map<String, List<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void  customizeGrouping(){
        Map<String, List<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING":"AVERAGE"));
        System.out.println(studentMap);
    }

    public static void  twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student :: getGradeLevel,Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING":"AVERAGE")));
        System.out.println(studentMap);
    }

    public static void  twoLevelGrouping_2(){
        Map<String, Integer> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student :: getName,Collectors.summingInt(Student :: getNoteBooks)));
        System.out.println(studentMap);
    }
    public static void  threeArgumentGroupBy(){
        Map<String, Set<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student :: getName, LinkedHashMap::new,toSet()));
        System.out.println(studentMap);
    }

    public static void  calculateTopGpa(){
       Map<Integer,Optional<Student>> studentMapOptional =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student :: getGradeLevel,
                        maxBy(Comparator.comparing(Student ::getGpa))));
        System.out.println(studentMapOptional);

        Map<Integer,Student> studentMapOptional1 =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student :: getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student ::getGpa)),Optional::get)));
        System.out.println(studentMapOptional1);
    }

    public static void  calculateLeastGpa(){
        Map<Integer,Optional<Student>> studentMapOptional =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student :: getGradeLevel,
                        minBy(Comparator.comparing(Student ::getGpa))));
        System.out.println(studentMapOptional);

        Map<Integer,Student> studentMapOptional1 =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student :: getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student ::getGpa)),Optional::get)));
        System.out.println(studentMapOptional1);
    }

    public static void main(String[] args) {
//        groupingByGender();
//        customizeGrouping();
//        twoLevelGrouping_1();
//        twoLevelGrouping_2();
//        threeArgumentGroupBy();
        calculateTopGpa();
        calculateLeastGpa();
    }
}
