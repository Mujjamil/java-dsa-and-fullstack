package com.mj.oops.linearsearch;

public class SearchMinimum  {
    //Find Minimum element in Array
   public static void main(String[] args) {

       int[] arr={9,3,6,9,4};
       System.out.println(min(arr));

    }
    static int min(int[] arr){
       int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];

            }

        }
        return ans;
    }
}
