package com.javabyvishalsir.interfaces.upiherarchy;

public class Hdfc implements Upi {

    private int id;
    private String name;
    private double balance;

    public Hdfc(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    @Override
    public void pay(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(name + ", your payment of ₹" + amount + "was successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void checkbalance() {
        System.out.println(name + ", your remaining balance is: ₹" + balance);
    }


}