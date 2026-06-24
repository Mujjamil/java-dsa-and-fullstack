package com.bitcode.filedb;

import java.io.*;

public class Main {
    static void main(String[] args) {
        //
        String path = "/Users/mactm/Desktop/newbit/demo.txt";
        Product p1 = new Product(1, "marker", 100);
        Product p2 = new Product(2, "colors", 200);


        try {
            FileOutputStream fout = new FileOutputStream(path);
            ObjectOutputStream obOut = new ObjectOutputStream(fout);
            obOut.writeObject(p1);
            System.out.println("Write successfully!!");
            obOut.close();
            fout.close();

            //Case 2 Desyraliation
            FileInputStream fin = new FileInputStream(path);
            ObjectInputStream obIn = new ObjectInputStream(fin);
            Product prodDe = (Product) obIn.readObject();
            System.out.println("descrialized obj=" + prodDe);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}