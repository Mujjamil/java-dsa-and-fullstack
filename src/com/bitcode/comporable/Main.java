package com.bitcode.comporable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"aaa",30));
        list.add(new Student(10,"bbb",40));
        list.add(new Student(20,"ccc",50));

        System.out.println("original list:"+list.toString());
        Collections.sort(list,new StudentByName());
        System.out.println("sorted byname list"+list);
        Collections.sort(list,new StudentByName());


    }
}
