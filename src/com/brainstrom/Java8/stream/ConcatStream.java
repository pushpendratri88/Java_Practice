package com.brainstrom.Java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class ConcatStream {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> list2 = Arrays.asList(4,7,9);
        HashSet<Integer> uniqueSet = new HashSet<>();

        Stream<Integer> concatStream = Stream.concat(list1.stream() , list2.stream());
        concatStream.sorted(Comparator.reverseOrder()).filter(num -> uniqueSet.add(num)).forEach(System.out::println);
    }
}
