package com.roboslyq.learn.netty.server;

import com.roboslyq.learn.netty.server.EchoServer;

public class EchoServerMain {
    public static void main(String[] args) throws Exception {
        int port = 8081;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }
        new EchoServer(port).run();
    }
}
