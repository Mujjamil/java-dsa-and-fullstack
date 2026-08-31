package com.javabyvishalsir;

class Bus extends Vehiclee {

    int capacity;

    // Constructor
    Bus(String brand, int price, int capacity) {
        super(brand, price);
        this.capacity = capacity;
    }

    @Override
    void start() {
        System.out.println("Bus starts with key");
    }

    void busDetails() {
        display();
        System.out.println("Capacity: " + capacity);
    }
}

