package com.thinkitive;

public class BinarySearch {
    public static void main(String[]args){
        int arr[] = {2,4,6,8,10};
        int key = 8;
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                System.out.println("Found at index: "+mid);
                break;
            }
            if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
}
