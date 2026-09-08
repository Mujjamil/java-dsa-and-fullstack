package com.javabyvishalsir.interfaces.upiherarchy;

public class Axix implements Upi{
    private int id;
    private String name;
    private double balance;

    public Axix(int id , String name , double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    @Override
    public void pay(double amount) {
      if(amount<=balance){
          balance = balance-amount;
          System.out.println(name+"your:"+amount+"is added successfully to your acoount of axis bank");
      }else{
          System.out.println("Insufficient balance");
      }
    }

    @Override
    public void checkbalance() {
        System.out.println(name+"sir your balance of axis bank"+balance);
    }
}
