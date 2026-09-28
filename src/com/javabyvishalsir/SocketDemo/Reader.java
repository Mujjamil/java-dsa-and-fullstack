package com.javabyvishalsir.SocketDemo;

import java.io.IOException;
import java.io.InputStream;

public class Reader extends Thread {
    private InputStream in;

    public Reader(InputStream in ){
        this.in = in;
    }

    @Override
    public void run() {
        byte[] data = new byte[1024];
        int count;
        while (true){
            try{
                if(in.available() > 0){
                    count = in.read(data);
                    System.out.println(new String(data,0,count));
                }

            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}
