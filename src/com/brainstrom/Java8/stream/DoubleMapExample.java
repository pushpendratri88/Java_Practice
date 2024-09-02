package com.brainstrom.Java8.stream;

import com.brainstrom.data.Bike;
import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;


public class DoubleMapExample {
    public static void main(String[] args) {
        getBikeList();
//        System.out.println(getBikeList());
    }
    static BiConsumer<String,Long> consumer = (k, v) -> System.out.println(k + "::" + v);
    public static void getBikeList(){
         StudentDataBase.getAllStudents()
                .stream()
                .map(Student :: getBikes)
                .flatMap(List :: stream)
                .map(Bike :: getModel)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach(consumer);

    }
}
