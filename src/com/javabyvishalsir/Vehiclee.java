package com.javabyvishalsir;

public class Vehiclee {


    private String brand;
    private int price;

   public Vehiclee(String brand, int price){
       this.brand = brand;
       this.price = price;
   }


   void display(){
       System.out.println("Brand:"+brand);
       System.out.println("Price:"+price);

   }
   void start(){
       System.out.println("Vehicle is starting");
   }


}
