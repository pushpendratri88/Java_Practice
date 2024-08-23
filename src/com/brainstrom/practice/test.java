package com.brainstrom.practice;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.Arrays;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        //Activities Count
        Map<String,Long> activitiesCount = studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(activitiesCount);
        // Char Frequency
        String str = "pushpendra Tripathi ";
        Map<String,Long> charCount  = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);


    }
}
