package com.thinkitive;


public class LinearSearch {
    static void main(String[] args) {
        int arr[] = {5,2,8,1,9};
        int key = 9;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.println("found at index: "+i);
                break;
            }
        }
    }
}
