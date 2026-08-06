package com.vishalsirdsa.queue;

public class Queue {
    private int [] arr;
    private int size;
    private int front , rear;

    public Queue(int size){
        this.size = size;
        arr = new int[size];
        front = rear = -1;
    }

    public boolean isFull(){
        return rear == size - 1;
    }
    public boolean isEmpty(){
        return (front == -1 && rear == -1) || (front > rear);
    }

   public boolean insert(int data){
        if(isFull()){
            return false;
        }
        arr[++rear] = data;
        if(front == -1){
            front = 0;
        }
        return true;
   }
   public int delete(){
    if(isEmpty()){
        return -1;
    }
    return arr[front++];
   }
}
