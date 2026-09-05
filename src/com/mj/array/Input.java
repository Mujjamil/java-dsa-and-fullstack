package com.mj.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 22;
        arr[2] = 26;
        arr[3] = 27;
        arr[4] = 28;
        System.out.println(arr[3]);

        Scanner sc = new Scanner(System.in); //By input method
        for (int i = 0; i < 5 ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

        }

        //enhanced version of array
        for(int num : arr){
            System.out.println(num+"  ");
        }


        //array of object
        String[] str = new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "kunal";
        System.out.println(Arrays.toString(str));
    }




}
