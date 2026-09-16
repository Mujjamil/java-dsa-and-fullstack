package com.definelabpractice;

public class practice {
  public static void main(String[] args){
//      int a = 10;
//      int b = 10;
//      System.out.println(a == b);//output will be true

      String s1 = new String("Hello");
      String s2 = new String("Hello");
      System.out.println(s1 == s2);//output will be false
      System.out.println(s1.equals(s2));// output will be true
  }

}
