package com.mj.array;

import java.util.Arrays;

public class PassingFuncton {
    static void main(String[] args) {
        int[] nums ={2,3,5,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
