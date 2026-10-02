package com.dsa;
//217. Contains Duplicate
//Easy
//        Topics
//premium lock icon
//        Companies
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


import java.util.HashSet;

public class ContainDuplicate {

        public static void main(String[] args) {
//
//            int[] nums = {1, 2, 3, 1};
//            boolean duplicate = false;
//            for (int i = 0; i < nums.length; i++) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[i] == nums[j]) {
//                        duplicate = true;
//                        break;
//                    }
//                }
//                if (duplicate) {
//                    break;
//                }
//            }
//            System.out.println(duplicate);
//        }

            int[] nums = {1,2,3,4};
            int[] nums2 = {1,2,2,3,4,4};
            boolean isDupliicate = containsDuplicate(nums);
            System.out.println(isDupliicate);

        }

        public static boolean containsDuplicate(int[] nums){
            HashSet<Integer> set = new HashSet<>();//solved using HashMap
            for(int num : nums){
                if(set.contains(num)){
                    return true;
                }
                set.add(num);
            }
            return false;
        }
    }



