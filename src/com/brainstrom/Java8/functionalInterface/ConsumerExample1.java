package com.brainstrom.Java8.functionalInterface;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {
    static Consumer<Student> cust1 = c -> System.out.println(c);
    static Consumer<Student> cust2 = c -> System.out.print(c.getName().toUpperCase());
    static Consumer<Student> cust3 = c -> System.out.println(c.getActivities());

    public static void main(String[] args) {
        List<Student> stuList = StudentDataBase.getAllStudents();
        stuList.forEach(student -> {
           cust2.andThen(cust3).accept(student);
        });

    }
}
