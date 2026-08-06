package com.vishalsirdsa.queue;

public class Main {

    public static void main(String[] args) {
        CircularQueue1 cq = new CircularQueue1(5);
        System.out.println("isFull: " + cq.isFull());
        System.out.println("isEmpty: " + cq.isEmpty());

        System.out.println("Insert: " + cq.insert(10));
        System.out.println("Insert: " + cq.insert(20));
        System.out.println("Insert: " + cq.insert(30));
        System.out.println("Insert: " + cq.insert(40));
        System.out.println("Insert: " + cq.insert(50));
        System.out.println("Insert: " + cq.insert(60));

        System.out.println("Del: " + cq.delete());
        System.out.println("Insert: " + cq.insert(60));

    }

    public static void main1(String[] args) {
        Queue q = new Queue(5);
        System.out.println("isFull: " + q.isFull());
        System.out.println("isEmpty: " + q.isEmpty());

        System.out.println("Ins: " + q.insert(10));
        System.out.println("Ins: " + q.insert(20));
        System.out.println("Ins: " + q.insert(30));
        System.out.println("Ins: " + q.insert(40));
        System.out.println("Ins: " + q.insert(50));
        System.out.println("Ins: " + q.insert(60));

        System.out.println("Del: " + q.delete());
        System.out.println("Ins: " + q.insert(60));
        System.out.println("Del: " + q.delete());
        System.out.println("Del: " + q.delete());
        System.out.println("Del: " + q.delete());
        System.out.println("Del: " + q.delete());

        System.out.println("isFull: " + q.isFull());
        System.out.println("isEmpty: " + q.isEmpty());

    }
}
