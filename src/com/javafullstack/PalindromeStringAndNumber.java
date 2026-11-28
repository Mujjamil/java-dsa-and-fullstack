package com.javafullstack;

public class PalindromeStringAndNumber {
    public static void main(String[] args){
        System.out.println("The Palindrome String is "+palindromestring("madam"));
        System.out.println("The Palindrom Numbr is:"+isPalindromNumber(2345));
    }

    static Boolean palindromestring(String input){
        int left = 0;
        int right = input.length() - 1;
        while(left < right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }//worst case time complexity will be O(n) or if the input is differ then it will be O(1). and the space complexity will be O(1)
    //because charAt() reads from the original string and the methods stores only two indices.


    static Boolean isPalindromNumber(int x){
        int temp = x;
        int rev = 0;

        while(x > 0){
            int digit = x % 10;
            rev = (rev*10) + digit;
            x = x/10;
        }

        if(rev == temp) {
            return true;
        }else{
            return false;
        }
    }
}

//in string palindrome is used two pointer approach where it takes time complexity O(n) and space will be O(1)
//And in number palindrom i used divisional formula to campare the number and give its palindrome or not
