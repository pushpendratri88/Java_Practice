package com.brainstrom.Java8.functionalInterface;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
