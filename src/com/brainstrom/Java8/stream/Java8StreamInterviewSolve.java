package com.brainstrom.Java8.stream;


import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8StreamInterviewSolve {
    static IntConsumer intConsumer = num -> System.out.println(num);

    static Consumer<Integer> consumer = input -> System.out.println(input);

    public static void main(String[] args) {
        Java8StreamInterviewSolve solution = new Java8StreamInterviewSolve();
        System.out.println("########### Find Number Start with 1 ###########");
        solution.findNoStartWith1();
        System.out.println("########### Find Even Number ###########");
        solution.findEvenNo();
    }

    public void findNoStartWith1(){
        int[] intArray = new int[] {1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21};
        Arrays.stream(intArray)
                .filter(num -> Integer.toString(num).startsWith("1"))
                .forEach(intConsumer);
    }
//    10,15,8,49,25,98,32
    public void findEvenNo (){
        List<Integer>  mixedInteger = Arrays.asList(10,15,8,49,25,98,32);
        mixedInteger.stream()
                .filter(n -> n%2 == 0)
                .forEach(consumer);
    }
//  1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21
    public void findDuplicateElement(){
        List<Integer> duplicateInt = Arrays.asList(1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21);
        Set<Integer> uniqueInt = new HashSet<>();
        duplicateInt.stream()
                .filter(num -> !uniqueInt.add(num))
                .forEach(System.out::println);
    }

//  1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21
    public void findDuplicateUniqueElement(){
        List<Integer> duplicateInt = Arrays.asList(1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21);
        Set<Integer> uniqueInt = new HashSet<>();
        Set<Integer> duplicates =  duplicateInt.stream()
                .filter(num -> !uniqueInt.add(num))
                .collect(Collectors.toSet());
        duplicates.forEach(System.out::println);
    }

//  1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21
    public  void findFirstElement(){
        int[] intarray = new int[]{ 15,15,17,17,17,19,21,21,21,21};
        OptionalInt optionalFirst = Arrays.stream(intarray).findFirst();
        if(optionalFirst.isPresent()){
            System.out.println(optionalFirst.getAsInt());
        }
    }

//  1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21
    public void totalCount(){
        int[] intArray = new int[] {1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21};
        long count = Arrays.stream(intArray).count();
        System.out.println(count);
    }

//  10,15,8,49,25,98,98,32,15
    public void findMax(){
        List<Integer> listOfArray = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max = listOfArray.stream().max(Integer::compare).get();
        System.out.println(max);
    }
//    10,15,8,49,25,98,98,32,15
    public void sortInt(){
        int[] unSortInt = new int[] {10,15,8,49,25,98,98,32,15};
        IntStream sortedInt = Arrays.stream(unSortInt).sorted();
        sortedInt.forEach(val -> System.out.println(val));
    }

    public void DescSortInt(){
        int[] unSortInt = new int[] {10,15,8,49,25,98,98,32,15};
        IntStream sortedInt = Arrays.stream(unSortInt).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer:: intValue);
        sortedInt.forEach(val -> System.out.println(val));
    }

}
