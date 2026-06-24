package com.bitcode.mysql;

public class Main {
    static void main() {
//    DbUtil.getConnection();
        DbUtil db = new DbUtil();

        //insert record
//        Student s = new Student(3,"test",39,2022);
//        db.insertRec(s);

        //case 2 Read all Record
        db.readRecord();

        //case 3 update thread
//        Student s = new Student(3,"test",40,2022);
//        db.updateRecord(s);

        //case 4 delete thread
        Student s = new Student(3,"test",40,2022);
        s.setRollno(3);
//        db.deleteRecord(s);

//        case 5 search by Year
        Student s1 = new Student(1,"Mj",89,2026);
        db.searchByYear(s1);


    }
}
