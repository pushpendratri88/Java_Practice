package com.brainstrom.Java8.functionalInterface;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Student> p1 = p -> p.getGradeLevel() >= 3;
        Predicate<Student> p2  =p->  p.getGpa() >= 3.9;
        System.out.println("#############Predicate Test#############");
        StudentDataBase.getAllStudents().forEach(s -> {
            if(p1.and(p2).test(s)){
                System.out.println("Name : "+s.getName()+ "  Activities : " + s.getActivities());
            }
        });

        System.out.println("#############Predicate Negate Test#############");
        StudentDataBase.getAllStudents().forEach(s -> {
            if(p1.and(p2).negate().test(s)){
                System.out.println("Name : "+s.getName()+ "  Activities : " + s.getActivities());
            }
        });

    }
}
