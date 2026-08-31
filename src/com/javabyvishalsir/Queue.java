package com.javabyvishalsir;

public class Queue {

        // Data members
        private int[] queue;
        private int front;
        private int rear;
        private int size;

        // Static object of Queue
        private static com.javabyvishalsir.Queue instance;

        // Private constructor
        private Queue() {
            size = 5;
            queue = new int[size];
            front = -1;
            rear = -1;
        }

        // Singleton method
        public static com.javabyvishalsir.Queue getInstance() {

            if (instance == null) {
                instance = new com.javabyvishalsir.Queue();
            }

            return instance;
        }

        // Add element
        public void enqueue(int value) {

            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear++;
            queue[rear] = value;

            System.out.println(value + " inserted");
        }

        // Remove element
        public void dequeue() {

            if (front == -1 || front > rear) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.println(queue[front] + " removed");
            front++;
        }

        // Display queue
        public void display() {

            if (front == -1 || front > rear) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.println("Queue elements:");

            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    public static void main(String[] args) {

        // Getting Queue object
        com.javabyvishalsir.Queue q1 = com.javabyvishalsir.Queue.getInstance();

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);

        q1.display();

        q1.dequeue();

        q1.display();


        // Trying to get another Queue object
        com.javabyvishalsir.Queue q2 = com.javabyvishalsir.Queue.getInstance();

        // Both references point to the same object
        System.out.println(q1 == q2);
    }
    }





