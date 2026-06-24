package com.bitcode.list;

import java.util.*;

public class Main {
    public static void arrayListDemo(){
        List<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println("size "+colors.size());
        System.out.println(colors.get(1));

        //diplay the arrayList;
        for(String s:colors){
            System.out.println("\n"+s);
        }
        System.out.println("---------");
        colors.addFirst("silver");
        colors.addLast("golden");
        colors.remove(1);
        System.out.println(colors.reversed());

        //Iterator method
        Iterator<String> itr = colors.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //Case 2
        List<Integer> marks = new ArrayList<Integer>();
        marks.add(100);
        marks.add(20);
        System.out.println(marks);

//        Case 3
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"aaa",10));
        list.add(new Student(2,"bbb",20));
        list.add(new Student(3,"ccc",30));


    }


    public static void linkedList(){
        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("cherrry");
        fruits.add("oranges");
        fruits.add("chickoo");
        fruits.add(2,"banana");


        System.out.println(fruits.subList(1,3));
        Iterator<String> itr = fruits.descendingIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static void vectorDemo() {
//        Vector<Integer> v = new Vector<Integer>(20);
//        System.out.println(v.capacity());
//        v.add(10);
//        v.add(2);
//        v.add(1);
//        v.add(10);
//        v.add(2);
//        v.add(1);
//        v.add(10);
//        v.add(2);
//        v.add(1);
//        v.add(10);
//        v.add(2);
//        v.add(1);
//        System.out.println("size "+v.size());
//        System.out.println("capacity "+v.capacity());
//        v.remove(1);
//        System.out.println(v.size());

        Stack<Integer> s = new Stack<Integer>();

        s.push(10);
//        s.add(20);
//        s.add(1,22);
        s.push(20);
        s.push(30);
        s.pop();




        System.out.println(s);

    }

    static void main(String[] args) {

//    arrayListDemo();
//        linkedList();
        vectorDemo();
    }
}
