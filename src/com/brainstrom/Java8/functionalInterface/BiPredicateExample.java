package com.brainstrom.Java8.functionalInterface;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {
    static BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa) -> gradeLevel >= 3 && gpa >3.9;
    static Consumer<Student> stuConsumer = student -> {
        if(biPredicate.negate().test(student.getGradeLevel(),student.getGpa())){
        System.out.println(student);
        }
    };
    public static void main(String[] args) {
        filterStudent();
     }

    private static void filterStudent() {
        StudentDataBase.getAllStudents().forEach(stuConsumer);
    }
}
