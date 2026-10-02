package com.dsa;
//217. Contains Duplicate
//Easy
//        Topics
//premium lock icon
//        Companies
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


public class ContainDuplicate {

        public static void main(String[] args) {

            int[] nums = {1, 2, 3, 1};

            boolean duplicate = false;

            for (int i = 0; i < nums.length; i++) {

                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[i] == nums[j]) {
                        duplicate = true;
                        break;
                    }
                }

                if (duplicate) {
                    break;
                }
            }

            System.out.println(duplicate);
        }
    }



