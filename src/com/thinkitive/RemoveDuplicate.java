package com.thinkitive;

import java.util.HashSet;

public class RemoveDuplicate {
    static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5};

        HashSet<Integer> set=new HashSet<>();

        for(int x:arr)
            set.add(x);

        System.out.println(set);
    }
}
