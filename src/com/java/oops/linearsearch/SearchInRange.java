package com.mj.oops.linearsearch;

public class SearchInRange {
    //arr = [18,12,3,24,43]
        //Search for 3 in the range of index [1,4]
    static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 3;
        int start = 1;
        int end = 4;
        System.out.println(linearSearch(arr,target,start,end));
    }
    static int linearSearch(int[] arr, int target,int start , int end){
        if(arr.length == 0){
            return -1;
        }
//        run for loop
        for (int index = start; index < end; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if none of the return statmenet above have executed
        //hence the target not found
        return -1;
    }
}
