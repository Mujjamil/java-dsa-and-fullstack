package com.bitcode.comporable;

import java.util.Comparator;

public class Student  {
    public int rollno;

    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public String name;
    public int marks;
}
