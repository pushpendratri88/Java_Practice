package com.brainstrom.mathsProblem;

public class factorial {
    public static void main(String[] args) {
        int count = 5 ;
        int fact = 1 ;
        for(int i = 1; i <= count; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
