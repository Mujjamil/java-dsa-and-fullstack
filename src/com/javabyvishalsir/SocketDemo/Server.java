package com.javabyvishalsir.SocketDemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server");
        ServerSocket ss = new ServerSocket(4001,10, InetAddress.getLocalHost());

        Socket socket = ss.accept();
        System.out.println("Connected");

        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();


        new Reader(in).start();
        new Writer(out).start();
    }

    public static void main1(String[] args) throws Exception{
        InetAddress address = InetAddress.getByName("Flipkar.com");
        System.out.println(address.getAddress());

        InetAddress[] addresses = InetAddress.getAllByName("google.com");
        for(InetAddress ia : addresses){
            System.out.println(ia.getHostAddress());
        }

        InetAddress lodalhost = InetAddress.getLocalHost();
        System.out.println(lodalhost.getHostAddress());


    }
}
