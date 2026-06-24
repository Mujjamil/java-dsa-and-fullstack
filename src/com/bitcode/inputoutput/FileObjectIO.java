package com.bitcode.inputoutput;

import com.bitcode.list.Student;

import java.io.*;

public class FileObjectIO {
    static void fileObjectDemo(){
        String path = "/Users/mactm/IdeaProjects/code/src/com/bitcode/inputoutput/student.dat";
        //write object
        Product prod = new Product(101,"Mj",85);
        try{
            FileOutputStream fout = new FileOutputStream(path);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(prod);
            oout.close();
            fout.close();
            System.out.println("Object written Successfully");
        }catch (IOException e ){
            e.printStackTrace();
        }

        try{
            FileInputStream fin = new FileInputStream(path);
            ObjectInputStream oin = new ObjectInputStream(fin);
            Student s = (Student) oin.readObject();


            System.out.println("Object Read Successfully!");

            System.out.println(s);

            oin.close();

            fin.close();
        }catch (Exception e) {

            e.printStackTrace();

        }
    }

    static void main(String[] args) {
        fileObjectDemo();
    }
}
