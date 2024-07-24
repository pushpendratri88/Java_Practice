package com.brainstrom.Java8.stream.terminal;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAverageExample {
    public static int sum (){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student :: getNoteBooks));
    }

    public static double average (){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student :: getNoteBooks));
    }
    public static void main(String[] args) {
        System.out.println("Sum : " + sum());
        System.out.println("Averaging : " + average());
    }
}
