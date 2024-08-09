package com.brainstrom.Java8.stream;

import com.brainstrom.data.Bike;
import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class DoubleMapExample {
    public static void main(String[] args) {
        System.out.println(getBikeList());
    }
    public static Map<String,Long> getBikeList(){
       return  StudentDataBase.getAllStudents()
                .stream()
                .map(Student :: getBikes)
                .flatMap(List<Bike> :: stream)
                .map(Bike :: getModel)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    }
}
