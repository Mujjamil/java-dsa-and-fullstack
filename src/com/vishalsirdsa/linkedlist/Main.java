package com.vishalsirdsa.linkedlist;

public class Main {
    public static void main(String[] args){
        SinglyLInkedList sll = new SinglyLInkedList();
        sll.display();
        sll.insert(10);
        sll.display();
        sll.insert(20);
        sll.display();
        sll.insert(30);
        sll.display();
        sll.insert(40);
        sll.display();

        sll.delete(7);

        System.out.println( sll.insert(60, 7) );

        sll.insert(50, 1);
        sll.display();
        sll.insert(60, 4);
        sll.display();
        sll.insert(70, 7);
        sll.display();
        sll.insert(90, 9);
        sll.display();

        sll.insert(50, 4);
        sll.insert(50, 6);
        sll.display();

        //Delete all the occurrences of 50
//        while(sll.deleteByVal(50))
//            ;

        sll.display();
        //sll.reverse();
        sll.display();
        System.out.println("-----------------");
        sll.displayRecursive(sll.getHead());
        //sll.displayRev();
        //sll.displayRevBetterOne();


//        sll.deleteByVal(50);
//        sll.display();
//        sll.deleteByVal(30);
//        sll.display();
//        sll.deleteByVal(70);
//        sll.display();
//        sll.deleteByVal(50);
//        sll.display();

//        sll.delete(1);
//        sll.display();
//        sll.delete(4);
//        sll.display();
//        sll.delete(5);
//        sll.display();
    }
}
