package com.brainstrom.Java8.functionalInterface;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierExample {

    static Consumer<Student>  stuConsumer = student -> System.out.println(student);
    public static Supplier<Student> studentSupplier= () -> {
        return new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
    };

    public static Supplier<List<Student>> studentsSupplier = () -> {
        return StudentDataBase.getAllStudents();
    };
    public static void main(String[] args) {
        System.out.println("Student is  : " + studentSupplier.get());
        studentsSupplier.get().forEach(stuConsumer);
//        System.out.println("Students are : " + studentsSupplier.get());
    }
}
