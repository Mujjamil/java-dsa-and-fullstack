package com.javabyvishalsir.Networking;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Dthread extends Thread{
    private String host;

    public Dthread(String host){
        this.host = host;
    }

    @Override
    public void run() {
        while(true){
            try{
                URL url = new URL(host);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                InputStream in = conn.getInputStream();
                StringBuffer buff = new StringBuffer();
                byte[] data = new byte[1024*4];
                int count;
                while((count = in.read(data)) != -1){
                    //buff.append(new String(data,0,count));
                }
                conn.disconnect();
            }catch (Exception c) {

            }
        }
    }
}
