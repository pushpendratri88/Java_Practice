package com.brainstrom.designpattern;

public class SingletonPattern {
    private static final SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern(){
    }

    public static SingletonPattern getInstance(){
        return singletonPattern;
    }
}
