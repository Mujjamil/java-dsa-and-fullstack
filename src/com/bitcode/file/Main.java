package com.bitcode.file;

import java.io.File;
import java.io.IOException;

public class Main {
    static void fileDemo(){
        File file = new File("text.txt");
        if(file.exists()){
            System.out.println("File Exists..");
            System.out.println("getName()="+file.getName());
            System.out.println("getPath()="+file.getPath());
            System.out.println("getAbsolutePath()="+file.getAbsolutePath());
            System.out.println("getParent()="+file.getParent());
            System.out.println("lastModified()="+file.lastModified());
        }
        else{
           try{
                file.createNewFile();
           } catch (IOException e) {
             e.printStackTrace();
           }
            System.out.println("File created");
        }
    }
    static void main(String[] args) {
    fileDemo();
    }
}
