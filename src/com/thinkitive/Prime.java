package com.thinkitive;

public class Prime {
    public static void main(String[] args){
        int n = 29;
        boolean prime = true;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                prime=false;
                break;
            }
            System.out.println(prime);
        }

    }

}
