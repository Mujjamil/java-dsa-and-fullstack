package com.dsa;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static void main(String[] args) {
//        int[] num = {3,4,5,6};
//        int target = 9;
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num.length; j++) {
//                if(num[i] + num[j] == target){
//                    System.out.println("["+num[i]+"  "+num[j]+"]");
//                    return;
//                }
//
//            }
//
//        }          //First approach but gives time complexity as n(o2) and space complexity as n(1)


        //By using HashMap
        int[] arr = {2,3,4,5,7};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));


    }


    public  static int[] twoSum(int[] nums , int targest){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = targest - nums[i];
            if(map.containsKey(complement)){
                return new int[]{
                        map.get(complement),
                        i
                };

            }
            map.put(nums[i],i);;
        }
        return new int[]{};
    }
   
    
}
