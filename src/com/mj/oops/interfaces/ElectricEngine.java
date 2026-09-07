package com.mj.oops.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Engine Accelerate");
    }
}
