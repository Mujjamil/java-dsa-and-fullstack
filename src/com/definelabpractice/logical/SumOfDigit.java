package com.definelabpractice.logical;

public class SumOfDigit {
    static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("The sum of all digit : " +sum);
    }
}
