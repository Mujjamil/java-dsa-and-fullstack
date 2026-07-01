package com.mj.oops.polymorphism;

import javax.net.ssl.SSLHandshakeException;


public class Shapes {
    void shape(){
            Shapes shape = new Shapes();
            Circle circle = new Circle();
            Square square = new Square();

            circle.area();
    }

    void area(){
        System.out.println("I am in shape");
    }
}
