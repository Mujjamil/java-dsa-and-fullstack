package com.mj;

public class CountNums {
    static void main(String[] args) {
        int n = 2355;
        int count = 0;
        while(n>0){
            int rem = n % 10;
            if(rem==5){
                count ++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
