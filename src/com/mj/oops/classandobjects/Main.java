package com.mj.oops.classandobjects;

import java.util.Arrays;

public class Main { // class creation
    static void main(String[] args) {  //method creation
//    Student[] students = new Student[5];
//    Student kunal; // just declaring
//        System.out.println(Arrays.toString(students));
//        Student kunal = new Student();
//        kunal.rno = 13;
//        kunal.name = "kunal pushpah";
//        kunal.marks = 99.3f;
//        System.out.println(kunal.rno);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);
//
//        Student random = new Student(kunal);
//        System.out.println(random.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something something";
        System.out.println(two.name);
    }
}

class Student{ //another class created
    int rno;
    String name;
    float marks;

    //we need a way to add the values of the aboves properties object by object
    //we need one word to access every object

    void greeting(){
        System.out.println("Hello! My name is "+this.name);
    }

    void changeName(String name){
        this.name = name;
    }
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

//    Student(){
//        this.rno=13;
//        this.name="Mj";
//        this.marks=34.34f;
//    }
    Student(int rolln , String name,float marks ){
        this.rno = rolln;
        this.name = name;
        this.marks = marks;

    }
    Student(){
        this(13,"Mujamil",34.3f);
    }

}
