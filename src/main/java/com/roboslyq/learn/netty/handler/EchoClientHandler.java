/**
 * Copyright (C), 2015-2019
 * FileName: EchoClientHandler
 * Author:   luo.yongqian
 * Date:     2019/6/5 13:08
 * Description: Test
 * History:
 * <author>                 <time>          <version>          <desc>
 * luo.yongqian         2019/6/5 13:08      1.0.0               创建
 */
package com.roboslyq.learn.netty.handler;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 *
 * 〈Test〉
 * @author luo.yongqian
 * @create 2019/6/5
 * @since 1.0.0
 */
@ChannelHandler.Sharable
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {
    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        ctx.write(Unpooled.copiedBuffer("Netty rocks!", CharsetUtil.UTF_8));
    }
    @Override
    public void channelRead0(ChannelHandlerContext ctx,
                             ByteBuf in) {
        System.out.println("Client received: " + ByteBufUtil
                .hexDump(in.readBytes(in.readableBytes())));  
    }
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx,  
                                Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}