package com.javabyvishalsir;

class Bike extends Vehiclee {

    int engineCC;

    // Constructor
    Bike(String brand, int price, int engineCC) {
        super(brand, price);
        this.engineCC = engineCC;
    }

    @Override
    void start() {
        System.out.println("Bike starts with self-start");
    }

    void bikeDetails() {
        display();
        System.out.println("Engine: " + engineCC + " CC");
    }
}
