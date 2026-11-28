package com.javafullstack;

public class ReverseString {
    public static void main(String[] args){
        String str = "Mujjamil";
        String reverse = "";
        for(int i = str.length()-1 ; i >= 0 ; i--){
            reverse += str.charAt(i);
        }//first method by using reverse the loop standar method.
        System.out.println(reversed("Mujjamil"));
    }

    static String reversed(String input){
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return  new String(chars);
    }//Converted String into char and the swipe that elements and again converted that into string for printing reverse output;
}

// in second method i used two pointer array by converting string into character . and then swipe the first and last element until its come to the middel
//time complexity is O(n) and space complexity to O(n) because  of array if the input is already char array its space complexity will be O(1).




