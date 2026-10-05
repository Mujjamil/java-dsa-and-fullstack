package com.javabyvishalsir.machinetest;

public class Main {
    public static void main(String[] args) {
        StudentService ss = new StudentService();
        ss.readStudent();
//        ss.displayStudents();
        ss.searchByname("Sneha Kulkarni");
        ss.searchByDepartmentNo("Electronics");
        ss.searchByrollNo(125);

    }
}