package com.bitcode.inputoutput;

import java.io.*;

public class InputOutputDemo {
    public static void fileIODemo(){
        ///Users/mactm/IdeaProjects/code/src/com/bitcode/inputoutput/text.txt
        //Case 1 wrtie operation
        String path = "/Users/mactm/IdeaProjects/code/src/com/bitcode/inputoutput/text.txt";
        String str = "HI there ";
        byte[] arr = str.getBytes();
        try{
            FileOutputStream fout=new FileOutputStream(path);
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            bout.write(arr);

            bout.flush();

            bout.close();

//            fout.write(arr);
       }catch (IOException e){
            //to do auto generated catch block
            e.printStackTrace();
        }

        System.out.println("Data written succesfully!!");
        //case read operation

        System.out.println("data from file..");
      try{
          FileInputStream fin = new FileInputStream(path);
          BufferedInputStream bin = new BufferedInputStream(fin);
            int n;

//            while((n=bin.read())!=-1){
////                System.out.print((char)n);
////                System.out.println(String(buffer,0));
//            }

//          case buffer
          byte[] buffer=new byte[20];
          n=bin.read(buffer,0,buffer.length);
          System.out.println(new String(buffer,0,n));
      }
      catch (IOException e){
          e.printStackTrace();
      }
    }

    static void fileRWDemo(){
        String path ="/Users/mactm/IdeaProjects/code/src/com/bitcode/inputoutput/text.txt";
//        case write
        try{
            FileWriter fw = new FileWriter(path);
            String str = "heloo file wrtier";
            char[] ch = str.toCharArray();
            fw.write(ch);
            System.out.println("Data written successully");
            fw.close();

            //case reader
            FileReader fr = new FileReader(path);
            int n ;
            char[] chArr = new char[20];
            n=fr.read(chArr);
            System.out.println("Data from file:"+new String(chArr,0,n));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void main(String[] args) {
//        fileIODemo();
        fileRWDemo();

    }
}
