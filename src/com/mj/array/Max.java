package com.mj.array;

import java.util.Arrays;

public class Max {
    static void main(String[] args) {
        int[] arr = {1,23,44,534};

        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
}
