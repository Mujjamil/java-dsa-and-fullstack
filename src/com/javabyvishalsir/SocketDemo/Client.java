package com.javabyvishalsir.SocketDemo;

import com.mj.array.Input;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Client");
        Socket socket = new Socket(InetAddress.getLocalHost(),4001);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        new Reader(in).start();
        new Writer(out).start();
    }
}
