package com.javabyvishalsir.SocketDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Writer extends Thread{
    private OutputStream out;

    public Writer(OutputStream out){
        this.out = out;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                out.write(
                        sc.nextLine().getBytes()
                );
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}
