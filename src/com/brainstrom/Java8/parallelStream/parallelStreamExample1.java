package com.brainstrom.Java8.parallelStream;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class parallelStreamExample1  {
    private static List<String> sequentialPrintStudentActivities(List<Student> students) {
        long startTime = System.currentTimeMillis();
        List<String> stringList = students.stream() // Stream<Student>
                .map(Student :: getActivities) // Transformed to Stream<List<String>> . if this returns List type as activities and you need all the elements in single stream then flatmap is required as below.
                .flatMap(List :: stream) // transform each element of a stream into a new stream of elements, and then combine all those streams into a single stream.
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential : "+ (endTime-startTime));
        return stringList;
    }
    private static List<String> parallelPrintStudentActivities(List<Student> students) {
        long startTime = System.currentTimeMillis();
        List<String> stringList = students.parallelStream() // Stream<Student>
                .map(Student :: getActivities) // Transformed to Stream<List<String>> . if this returns List type as activities and you need all the elements in single stream then flatmap is required as below.
                .flatMap(List :: stream) // transform each element of a stream into a new stream of elements, and then combine all those streams into a single stream.
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel : "+ (endTime-startTime));
        return stringList;
    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities(StudentDataBase.getAllStudents());
        parallelPrintStudentActivities(StudentDataBase.getAllStudents());
    }
}
