package com.thinkitive;

public class CountVowels {
    static void main(String[] args) {
        String s = "Education";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }

        System.out.println(count);
    }
}
