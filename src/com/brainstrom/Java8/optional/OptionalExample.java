package com.brainstrom.Java8.optional;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample  {
    public static Optional<String> getStudentNameOptional(){
        Optional<Student> student  = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(student.isPresent()){
            return student.map(Student :: getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(getStudentNameOptional().get());
    }
}
