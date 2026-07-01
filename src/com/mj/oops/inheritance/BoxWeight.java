package com.mj.oops.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double weight) {
        this.weight = -1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight=weight;

    }

    public BoxWeight(double l, double h, double w, double weight) {

        super(l, h, w);//calll the parent class contructor
        //used to intialise value present in parent class
//        System.out.println(super.w);
        this.weight = weight;
//        super.weight; //used super keyword 
    }

    public  BoxWeight(){
        this.weight = -1;
    }

}
