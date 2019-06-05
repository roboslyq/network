package com.roboslyq.learn.netty.server;

import com.roboslyq.learn.netty.client.EchoClient;

public class EchoClientMain {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.err.println(
                    "Usage: " + EchoClient.class.getSimpleName() +
                            " <host> <port>");
            return;
        }
// Parse options.
        final String host = args[0];
        final int port = Integer.parseInt(args[1]);
        new EchoClient(host, port).start();
    }
}
