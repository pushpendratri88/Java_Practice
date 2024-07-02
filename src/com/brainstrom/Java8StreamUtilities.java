package com.brainstrom;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8StreamUtilities {

    public void findNoStartWith1(){
        int[] intArray = new int[] {1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21};
        Arrays.stream(intArray)
                .filter(num -> Integer.toString(num).startsWith("1")).forEach(value -> System.out.println(value));
    }
//    10,15,8,49,25,98,32
    public void findEvenNo (){
        List<Integer>  mixedInteger = Arrays.asList(10,15,8,49,25,98,32);
        mixedInteger.stream().filter(n -> n%2 == 0).forEach(val -> System.out.println(val));
    }
//  1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21
    public void findDuplicateElement(){
        List<Integer> duplicateInt = Arrays.asList(1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21);
        Set<Integer> uniqueInt = new HashSet<>();
        duplicateInt.stream().filter(num -> !uniqueInt.add(num)).forEach(System.out::println);
    }

//  1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21
    public void findDuplicateUniqueElement(){
        List<Integer> duplicateInt = Arrays.asList(1,3,5,5,7,7,7,9,11,11,15,15,17,17,17,19,21,21,21,21);
        Set<Integer> uniqueInt = new HashSet<>();
        Set<Integer> duplicates =  duplicateInt.stream().filter(num -> !uniqueInt.add(num)).collect(Collectors.toSet());
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
