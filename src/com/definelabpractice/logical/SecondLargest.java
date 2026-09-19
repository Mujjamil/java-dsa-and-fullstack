package com.definelabpractice.logical;

public class SecondLargest {
    public static void main(String [] args){
        int[] arr = {10, 20, 5, 20, 8};
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int num : arr){//expansion would be like for(int i =0 ; i <= arr.length ; i++) { int num = arr[i] }
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        System.out.println("The largest number is : " + largest);
        System.out.println("The second Largest number is : "+ secondLargest);
    }
}
