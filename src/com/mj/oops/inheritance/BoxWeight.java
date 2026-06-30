package com.mj.oops.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//calll the parent class contructor
        //used to intialise value present in parent class
        this.weight = weight;
//        super.weight; //used super keyword 
    }

    public  BoxWeight(){
        this.weight = -1;
    }

}
