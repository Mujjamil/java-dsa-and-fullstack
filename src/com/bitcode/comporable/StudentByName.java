package com.bitcode.comporable;

import java.util.Comparator;

public class StudentByName implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}

 class StudentByMarks implements Comparator<Student>{
    public int compare(Student s1, Student s2){
    
        if(s1.marks==s2.marks){
            return s1.name.compareTo(s2.name);
        }
        else{
            return s1.marks-s2.marks;
        }
    }

}
