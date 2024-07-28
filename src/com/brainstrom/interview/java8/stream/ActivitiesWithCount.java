package com.brainstrom.interview.java8.stream;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ActivitiesWithCount {
    public static void main(String[] args) {
        System.out.println(getActivitiesWithCount());
    }

    public static Map<String,Long> getActivitiesWithCount(){

     return  StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List ::stream)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
