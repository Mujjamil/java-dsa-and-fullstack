package com.mj.oops.linearsearch;

public class MaxWealth {
    //https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args){

        int[][] accounts ={
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maxWealth(accounts));
    }
    public static int maxWealth(int[][] accounts){
        //person = row
        //account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            //when you start a new column , take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
            sum += accounts[person][account];
            }
            //now we have sum of accounts of person
            //check with overall answer
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;

    }
}
