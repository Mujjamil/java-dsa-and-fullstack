package com.mj.oops.inheritance;

public class Box {
    double h;
    double w;
    double l;
    double weight;

    Box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }


    Box(double l , double h , double w){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }

    //cube
    Box(double side){
        this.h=side;
        this.w=side;
        this.l=side;
    }
    Box(Box old){
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;
    }
    public void information(){
        System.out.println("Running the box[");
    }
}
