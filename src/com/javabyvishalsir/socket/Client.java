package com.javabyvishalsir.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.SequencedCollection;
import java.util.concurrent.ThreadPoolExecutor;

public class Client {

    private static final InetAddress HOST;
    private static final int PORT = 4001;

    static{
        try{
            HOST = InetAddress.getLocalHost();
        }catch (UnknownHostException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try{
            System.out.println("Enter username:");
            String username = new Scanner(System.in).nextLine();

            Socket socket = new Socket(HOST,PORT);
            System.out.println("Connected to Server");
            socket.getOutputStream().write(username.getBytes());

            new Reader(socket.getInputStream()).start();
            new Writer(socket.getOutputStream(),username).start();


        }catch (Exception e){
            new RuntimeException(e);
        }

    }

    private static class Reader extends Thread{
        private InputStream in;
        private boolean flag = true;

        public Reader(InputStream in){
            this.in = in;
        }

        @Override
        public void run() {
            byte[] data = new byte[1024 * 1];
            int count;
            try{
                while(true){
                    if(in.available() > 0){
                        count =in.read(data);
                        System.out.println(new String(data,0,count));
                    }
                }
            }catch (Exception e){

            }
        }
    }

    private static class Writer extends Thread{
        private OutputStream out;
        private boolean flag = true;
        private String username;

        public Writer(OutputStream out , String username){
            this.out = out;
            this.username = username;
        }

        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);
            while(flag){
                try{
                    String input = sc.nextLine();
                    input = username + ":" + input;
                    out.write(input.getBytes());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
