package com.brainstrom.Java8.terminal;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamMinByMaxByExample {
    public static Optional<Student> minBy_Example(){
       return  StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student :: getGpa)));
    }
    public static Optional<Student> maxBy_Example(){
        return  StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student :: getGpa)));
    }
    public static void main(String[] args) {
        System.out.println("MinBy_Example : " + minBy_Example());
        System.out.println("maxBy_Example : " + maxBy_Example());
    }
}
