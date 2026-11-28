package com.javafullstack;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(4));
    }
    static boolean isPrime(int x){
        for(int i = 2 ; i < x ; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
