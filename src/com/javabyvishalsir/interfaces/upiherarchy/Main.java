package com.javabyvishalsir.interfaces.upiherarchy;

public class Main {
    public static void main(String[] args){
        Hdfc hdfc = new Hdfc(2,"Mujjami",4000);
        hdfc.pay(3000);
        hdfc.checkbalance();

        System.out.println("--------------------------------");

        Axix axis = new Axix(3,"Aftab",5000);
        axis.pay(4000);
        axis.checkbalance();

        System.out.println("--------------------------------");

        Sbi sbi = new Sbi(3,"Tejas",6000);
        sbi.pay(4000);
        sbi.checkbalance();



    }
}
