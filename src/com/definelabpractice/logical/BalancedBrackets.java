package com.definelabpractice.logical;

import com.mj.oops.packagess.a.Greeting;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
    public static void main(String[] args){
        System.out.println(isBalanced("({[]})"));//true
        System.out.println(isBalanced("({[})"));//false
        System.out.println(isBalanced("((()))"));//true
    }
    static boolean isBalanced(String str){

        Deque<Character> stack = new ArrayDeque<>();//created empty stack
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            } else if (ch == ']' || ch == '}' || ch == ')') {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(!isMatchingPair(top,ch)){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    static boolean isMatchingPair(char open , char close){
        return (open == '[' && close == ']') ||
                (open == '{' && close == '}') ||
                (open == '(' && close == ')');
    }
}
