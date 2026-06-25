package com.bitcode.mysql;

public class Main {
    static void main(String[] args) {
        //    DbUtil.getConnection();
        DbUtil db = new DbUtil();

//        insert record
//        Student s = new Student(3,"Tushar",70,2022);
//        Student s2 = new Student(4,"Prithvi",80,2022);
//        Student s3 = new Student(5,"Rahul",65,2023);
//        Student s4 = new Student(6,"Saurabh",40,2025);
//        Student s6 = new Student(7,"Suraj",49,2026);
//        db.insertRec(s);
//        db.insertRec(s2);
//        db.insertRec(s3);
//        db.insertRec(s4);
//        db.insertRec(s6);

//        //case 2 Read all Record
//        db.readRecord();

        //case 3 update thread
//        Student s = new Student(3,"test",40,2022);
//        db.updateRecord(s);

        //case 4 delete thread
//        Student s = new Student(3,"test",40,2022);
//        s.setRollno(3);
//        db.deleteRecord(s);

//        case 5 search by Year
//        Student s1 = new Student(1,"Mj",89,2026);
//        db.searchByYear(s1);

//         case 6 checking A+ grade by year

        db.getRecord(2025,"second");


    }

}
