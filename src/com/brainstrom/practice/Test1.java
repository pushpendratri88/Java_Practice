package com.brainstrom.practice;

import com.brainstrom.data.Student;
import com.brainstrom.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        double a, b,c;
        a = 3.0/0;
        b = 0/4.0;
        c=0/0.0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
