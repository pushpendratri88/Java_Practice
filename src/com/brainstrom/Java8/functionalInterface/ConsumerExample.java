package com.brainstrom.Java8.functionalInterface;
//The primary objective of using a Consumer is to represent an operation that accepts a single input argument and returns no result.
//It is typically used for performing operations on a given input, such as printing, updating, or any other action that does not require returning a result.

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c1 = p -> System.out.println(p);
    static Consumer<Student> c2 = p -> System.out.print(p.getName().toUpperCase());
    static Consumer<Student> c3 = p -> System.out.println(p.getActivities());
    public static void main(String[] args) {
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }

    private static void printNameAndActivitiesUsingCondition() {
        System.out.println("##############PrintNameAndActivitiesUsingCondition##############");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s -> {

            if(s.getGradeLevel() >= 3 && s.getGpa() >= 3.9){
                c2.andThen(c3).accept(s);
            }
        });

    }

    private static void printNameAndActivities() {
        System.out.println("##############PrintNameAndActivities##############");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2.andThen(c3));
    }

    private static void printName() {
        System.out.println("##############PrintName##############");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
    }
}
