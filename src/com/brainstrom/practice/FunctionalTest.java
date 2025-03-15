package com.brainstrom.practice;

public class FunctionalTest {
    public static void main(String[] args) {

        SecondFunction firstFunction = (num, name) -> System.out.println(num + " " + name);
        firstFunction.display(10,"push");

    }
}
