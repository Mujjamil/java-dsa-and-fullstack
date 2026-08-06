package com.vishalsirdsa.linkedlist;

import java.util.Stack;

public class SinglyLInkedList {

    private  Node head;
    public SinglyLInkedList(){
        head = null;
   }
    public Node getHead() {
        return head;
    }
   public boolean insert(int data){
        Node newNode = new Node(data);
        if(newNode == null){
            return false;
        }
        if(head == null){
            head = newNode;
            return true;
        }

       //locate last node
       Node last = head;
        while(last.getNext() != null){
            last = last.getNext();
        }
        last.setNext(newNode);
        return true;
   }

   public boolean insert(int data , int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.setNext(head);
            head = newNode;
            return true;
        }
        //locate pos - node
       Node prev = head;
        for(int i = 1; i < pos - 1 ; i++){
            prev = prev.getNext();
            if(prev == null){
                return false;
            }
        }
       newNode.setNext(prev.getNext());
       prev.setNext(newNode);

       return true;
   }

   public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.getData()+" ");
            temp = temp.getNext();
        }
        System.out.println();
   }

   public boolean delete(int position){
        if(head == null){
            return false;
        }
        if(position == 1){
            head = head.getNext();
            return true;
        }

        //locate previous node
       Node prev = head;
        for(int i = 1 ; i < position - 1; i++){
            prev = prev.getNext();
            if(prev.getNext() == null){
                return false;
            }
        }

        Node del = prev.getNext();
        prev.setNext(del.getNext());

        return true;
   }
   public boolean deleteByVal(int data){
        if(head == null){
            return false;
        }

        if(head.getData() == data){
            head = head.getNext();
            return true;
        }
        Node prev = head , del = head.getNext();
        while(del.getData() != data){
            prev = del;
            del = del.getNext();
            if(del == null){
                return false;
            }
        }
        prev.setNext(del.getNext());
        return true;

   }
    public void displayRecursive(Node start) {
        if(start == null) {
            System.out.println();
            return;
        }
        displayRecursive(start.getNext());
        System.out.print(start.getData() + " ");
    }

    public void reverse() {

        if(head == null || head.getNext() == null) {
            return;
        }

        Node n1, n2, n3;
        n1 = head;
        n2 = head.getNext();

        while(n2 != null) {
            n3 = n2.getNext();
            n2.setNext(n1);
            n1 = n2;
            n2 = n3;
        }

        head.setNext(null);
        head = n1;
    }

    public void displayRev() {
        Stack<Integer> stack = new Stack<Integer>();
        Node temp = head;

        while(temp != null) {
            stack.push(temp.getData());
            temp = temp.getNext();
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public void displayRevBetterOne() {
        Stack<Node> stack = new Stack<Node>();
        Node temp = head;

        while(temp != null) {
            stack.push(temp);
            temp = temp.getNext();
        }

        while (!stack.empty()) {
            System.out.print(stack.pop().getData() + " ");
        }
        System.out.println();
    }

    public int deleteAllByVal(int data) {
        int count = 0;

        while(deleteByVal(data)) {
            count++;
        }

        return count;
    }

    public boolean deleteOccurrence(int data, int occ) {
        if(occ <= 0) {
            return false;
        }

        Node temp = head;
        int position = 1;
        int count = 0;

        while(temp != null) {
            if(temp.getData() == data) {
                count++;
                if(count == occ) {
                    return delete(position);
                }
            }

            temp = temp.getNext();
            position++;
        }

        return false;
    }
}




