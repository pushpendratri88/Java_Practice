package com.brainstrom.Java8.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static long checkPerformanceResult(Supplier<Integer> supplier , int numberOfTime){
       long startTime = System.currentTimeMillis();
        for (int i=0; i < numberOfTime; i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();

        return endTime-startTime;
    }
    public static int sum_Sequential_Stream(){
        return IntStream.rangeClosed(1,100000)
                .sum();
    }
    public static int sum_Parallel_Stream(){
        return IntStream.rangeClosed(1,100000).parallel()
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential :"+checkPerformanceResult(ParallelStreamExample::sum_Sequential_Stream,20));
        System.out.println("Parallel :"+checkPerformanceResult(ParallelStreamExample::sum_Parallel_Stream,20));
    }
}
