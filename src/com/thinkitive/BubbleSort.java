package com.thinkitive;

public class BubbleSort {
    static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;i++){
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
