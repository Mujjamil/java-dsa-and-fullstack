package com.bitcode.questions;
import java.util.*;
public class NumberTriangle {
    static void main(String[] args) {
        int[] arr={4,7,3,6,7};
        triangleDemo(arr);
    }
    static void triangleDemo(int[] arr){

            if(arr.length<1) {
                return;
            }
                int[] temp = new int[arr.length-1];
                for (int i = 0; i < arr.length-1; i++) {
                    temp[i] = arr[i] + arr[i+1];
                }
                triangleDemo(temp);
                for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                    System.out.print(num+" ");
                }
                System.out.println();
            }

    }

