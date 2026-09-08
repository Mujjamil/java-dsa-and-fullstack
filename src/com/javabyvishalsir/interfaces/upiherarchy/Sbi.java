package com.javabyvishalsir.interfaces.upiherarchy;

public class Sbi implements Upi{
    private int id;
    private String name;
    private double balance;

    public Sbi(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public void pay(double amount) {
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("your :"+amount+"is withdraw from account successfully");
        }else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public void checkbalance() {
        System.out.println(name+"your balance of Sbi bank Acount is"+balance);
    }
}
