package com.thinkitive;

public class SelectionSort {
    static void main(String[] args) {
        int arr[]={5,2,8,1,9};
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[min];

            arr[min]=arr[i];

            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
