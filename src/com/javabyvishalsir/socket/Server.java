package com.javabyvishalsir.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;

public class Server {

    private final static InetAddress HOST;
    private final static int PORT;
    private final static HashMap<String , Socket> userMap;

    static {
        try{
            HOST = InetAddress.getLocalHost();
        }catch (UnknownHostException e){
            throw new RuntimeException(e);
        }
        PORT = 4001;
        userMap = new HashMap<String, Socket>();
    }

    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(PORT , 10 , HOST);
            System.out.println("Server is Running....");
            byte[] data = new byte[100];
            int count;

            while (true){
                Socket socket = ss.accept();
                count = socket.getInputStream().read(data);
                String username = new String(data , 0 , count);
                System.out.println("Got connected to"+username);

                userMap.put(username,socket);
                new ServerReader(socket).start();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
    private static class ServerReader extends Thread{
        private Socket socket;

        public ServerReader(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run() {
            byte[] data = new byte[1024];
            int count;
            try{
                InputStream in = socket.getInputStream();
                while(true){
                    if(in.available() > 0) {
                        count = in.read(data);
                        String message = new String(data , 0 , count);
                        String[] messagePart = message.split(":");
                        userMap.get(messagePart[1]).getOutputStream().write(message.getBytes());

                    }
                }
            }catch (Exception e){

            }
        }
    }
}
