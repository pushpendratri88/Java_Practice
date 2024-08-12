package com.brainstrom.interview;

import java.util.ArrayDeque;
import java.util.Deque;

public class Nproglobal {
    public static void main(String[] args) {
        String input = "[(])";
        System.out.println("Result : " + isBalanceInput(input));

    }

    private static String isBalanceInput(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i< input.length(); i++){
            if(!(input.charAt(i) == ']' || input.charAt(i) == ')' || input.charAt(i) == '}')){
                stack.push(input.charAt(i));
            }
            if(input.charAt(i) == ']' || input.charAt(i) == ')' || input.charAt(i) == '}'){
                if(stack.isEmpty())
                    return "Not Balanced";
                char top = stack.pop();

                if(input.charAt(i) ==')' && top != '('
                        || input.charAt(i) ==')' && top != '('
                        || input.charAt(i) ==')' && top != '(' )
                    return "Not Balanced";
            }

        }
        return  stack.isEmpty() ? "Balanced" : "Not Balanced";
    }
}
