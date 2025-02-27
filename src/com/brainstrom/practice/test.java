package com.brainstrom.practice;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        //Activities Count
        Map<String,Long> activitiesCount = studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(activitiesCount);
        // Char Frequency
        String str = "pushpendraTripathi";
        Map<Character, Integer> map = new HashMap<>();
        char[] chArray = str.toCharArray();
        for(char ch : chArray){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }



    }
}
