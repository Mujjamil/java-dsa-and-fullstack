package com.javabyvishalsir;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 1500000, 5);
        Bike bike = new Bike("Honda", 150000, 150);
        Bus bus = new Bus("Volvo", 5000000, 50);

        car.carDetails();
        car.start();

        System.out.println();

        bike.bikeDetails();
        bike.start();

        System.out.println();

        bus.busDetails();
        bus.start();
    }
}
