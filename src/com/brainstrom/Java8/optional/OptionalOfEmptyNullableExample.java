package com.brainstrom.Java8.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
    //ofNullable
    public static Optional<String> ofNullable(){
        return Optional.ofNullable("hello");  // this will return the same which is passed as argument (like string is passed in and optional of same we are getting)
    }

    public static Optional<String> of(){
        return Optional.of("hello");    // of and ofNullable  both almost similar with one difference . if sure about the data (data is not null) then only use of or else use ofNullable
    }

    public static Optional<String> empty(){
        return Optional.empty();
    }

    //Of
    //empty
    public static void main(String[] args) {
        System.out.println(ofNullable().get());
        System.out.println(of().get());
        System.out.println(empty());

    }
}
