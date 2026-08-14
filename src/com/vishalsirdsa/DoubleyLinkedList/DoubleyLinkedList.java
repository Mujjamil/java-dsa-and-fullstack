package com.vishalsirdsa.DoubleyLinkedList;

public class DoubleyLinkedList {
    private Node head;
    public DoubleyLinkedList(){
        head = null;
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

        Node last = head;
        while(last.getNext() != null){
            last = last.getNext();
        }

        last.setNext(newNode);
        newNode.setPrev(last);
        return true;
    }

    public boolean insert(int data , int position){
        if(position <= 0){
            return false;
        }
        Node newNode = new Node(data);
        if(newNode == null){
            return false;
        }
        if(position == 1){
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
            return true;
        }
        Node prev = head;
        for (int i = 0; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false;
            }
        }

        newNode.setPrev(prev);
        if(prev.getNext() != null){
            newNode.setNext(prev.getNext());
            prev.getNext().setPrev(newNode);
        }
        prev.setNext(prev);
        return true;
    }
    public boolean deleteByPos(int position){
        if(head == null || position <=0){
            return false;
        }
        if(position == 1){
            head = head.getNext();
            if(head != null){
                head.setPrev(null);
            }
            return true;
        }

        //locate the node at position
        Node del = head;
        for (int i = 0; i < position; i++) {
            del = del.getNext();
            if(del == null){
                return false;
            }
        }
        Node prev = del.getPrev();
        Node next = del.getNext();
        prev.setNext(next);
        if(next != null){
            next.setPrev(prev);
        }
        return true;

    }
    public boolean deleteByVal(int data) {
        if (head == null) {
            return false;
        }

        if (head.getData() == data) {
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            }
            return true;
        }

        //locate the node at position
        Node del = head;
        while(del.getData() != data){
            del = del.getNext();
            if (del == null) {
                return false;
            }
        }

        Node prev = del.getPrev();
        Node next = del.getNext();

        prev.setNext(next);
        if (next != null) {
            next.setPrev(prev);
        }

        return true;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
