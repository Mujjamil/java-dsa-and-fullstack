package com.mj.oops.polymorphism;

public class Main {
    static void main() {
        Shapes shapes = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        circle.area();
    }
}
