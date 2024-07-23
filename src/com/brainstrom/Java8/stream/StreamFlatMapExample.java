package com.brainstrom.Java8.stream;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamFlatMapExample {
    static Consumer<String> consumer = activity -> System.out.println(activity);
    public static void main(String[] args) {
//      System.out.println("Print Student Activities : " + printStudentActivities(StudentDataBase.getAllStudents()));
        System.out.println("Print Student Activities : ");
        printStudentActivities(StudentDataBase.getAllStudents()).forEach(consumer);

//        System.out.println("Print Unique Sorted Student Activities : " + printUniqueSortedStudentActivities(StudentDataBase.getAllStudents()));
        System.out.println("Print Unique and Sorted Student Activities  : ");
        printUniqueSortedStudentActivities(StudentDataBase.getAllStudents()).forEach(consumer);
    }

    private static List<String> printUniqueSortedStudentActivities(List<Student> students) {
       return students.stream()                     // This statements returns Stream<Student>
                .map(Student :: getActivities)      // This statements returns Stream<List<String>>
                .flatMap(List :: stream)            // This statements returns Stream<String> in a single stream
                .distinct()                         // returns the unique values form the single stream (Just above)
                .sorted()                           // This will sort the above stream
                .collect(Collectors.toList());      // Thi will convert the stream to List type
    }

    private static List<String> printStudentActivities(List<Student> students) {
        List<String> stringList = students.stream() // Stream<Student>
                .map(Student :: getActivities) // Transformed to Stream<List<String>> . if this returns List type as activities and you need all the elements in single stream then flatmap is required as below.
                .flatMap(List :: stream) // transform each element of a stream into a new stream of elements, and then combine all those streams into a single stream.
                .collect(Collectors.toList());
        return stringList;
    }
}
