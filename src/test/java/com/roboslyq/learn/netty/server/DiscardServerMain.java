package com.roboslyq.learn.netty.server;

import com.roboslyq.learn.netty.server.DiscardServer;

public class DiscardServerMain {
    public static void main(String[] args) throws Exception {
        int port = 8080;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }
        new DiscardServer(port).run();
    }
}
