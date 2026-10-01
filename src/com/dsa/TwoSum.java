package com.dsa;

public class TwoSum {
    static void main(String[] args) {
        int[] num = {3,4,5,6};
        int target = 9;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if(num[i] + num[j] == target){
                    System.out.println("["+num[i]+"  "+num[j]+"]");
                    return;
                }
                
            }
            
        }
    }
   
    
}
