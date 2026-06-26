package com.mj.oops.linearsearch;

import java.util.Arrays;

public class Search2dArray {
    public static void main(String[] args){
        int[][] arr={{54,23,42,12},
                {32,13,53,65},
                {98,75,8,43},
                {10,12}
        };

        int target = 53;
        int [] ans = search(arr,target);//format of return value {row , col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr,int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }

            }


        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }

            }


        }
        return max;
    }
}
