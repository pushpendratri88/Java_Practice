package com.brainstrom.Java8.stream;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateActivities {
    public static void main(String[] args) {
        System.out.println(getUniquelist());
    }
    public static Set<String> getUniquelist(){
       return  StudentDataBase.getAllStudents()
                .stream()
                .map(Student :: getActivities)
                .flatMap(List :: stream)
                .collect(Collectors.toSet());
    }
}
