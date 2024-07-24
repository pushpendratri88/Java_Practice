// joining can be used to join content in collect method
package com.brainstrom.Java8.stream.terminal;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamJoiningExample {
    public static String joining_1(){
      return StudentDataBase.getAllStudents().stream()
                .map(Student :: getName)
                .collect(Collectors.joining()); // joining can be used to join content in collect method
    }
    public static String joining_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student :: getName)
                .collect(joining()); // use static import and utilize the joining method directly
    }
    public static String joining_3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student :: getName)
                .collect(joining(" , ","(", ")")); // use joining with delimiter and prefix and suffix
    }


    public static void main(String[] args) {
        System.out.println("Joining 1 : " + joining_1());
        System.out.println("Joining 2 : " + joining_2());
        System.out.println("Joining 3 : " + joining_3());
    }
}
