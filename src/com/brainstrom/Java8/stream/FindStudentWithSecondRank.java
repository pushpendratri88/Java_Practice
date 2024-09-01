package com.brainstrom.Java8.stream;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

public class FindStudentWithSecondRank {
    public static void main(String[] args) {
        Optional<Student> optionalStu = StudentDataBase.getAllStudents().stream().sorted(Comparator.comparingInt(Student::getRank).reversed()).skip(1  ).findFirst();
        optionalStu.ifPresent(student -> System.out.println(student));
    }
}
