package com.mj.oops.linearsearch;

public class Main {
    //Q. arr = [18,12,9,14,77,50]
//    Find Wether 14 exists in array or not
    static void main(String[] args) {
        int[] num = {23,45,345,234,54,2342};
        int target = 234;
        int ans = linearSearch(num,234);
        int asns = linearSearch2(num,234);
        System.out.println(asns);
        System.out.println(ans);

    }

    //search the target and return the element itself
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
//        run for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return element ;
            }
        }
        //this line will execute if none of the return statmenet above have executed
        //hence the target not found
        return -1;
    }
    //search in the array:return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
//        run for loop
        for (int index = 0; index < arr.length; index++) {
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
