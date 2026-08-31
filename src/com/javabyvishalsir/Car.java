package com.javabyvishalsir;

class Car extends Vehiclee{
    int seats;

    Car(String brand, int price , int seats){
        super(brand,price);
        this.seats = seats;
    }

    @Override
    void start(){
        System.out.println("Car start with key");
    }

    void carDetails(){
        display();
        System.out.println("Seats:"+seats);
    }
}
