package com.mj.oops.linearsearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class evenNumberDigit {
    static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count ++;
            }
        }
        return count;

    }

    //functions to check wether a number contains even digit or not
    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        * if(numberOfDigits%2==0){
        *   return true;
        * }
        *  return false;
        * */
        return numberOfDigits % 2 == 0;

    }

    //count number of digit in number
    static int digits(int num){
            int count = 0;
            while(num>0){
                count ++;
                num = num /10; // num/=10
            }
        return count;
    }

}
