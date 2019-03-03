package com.ycw.im.imsingel.learnNettyExample.ClientAndServer.codec.nettyCodec;

import com.ycw.im.imsingel.learnNettyExample.ClientAndServer.codec.Codec;
import com.ycw.im.imsingel.learnNettyExample.ClientAndServer.protocol.Packet;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class PacketEncoder extends MessageToByteEncoder<Packet> {
    @Override
    protected void encode(ChannelHandlerContext ctx, Packet packet, ByteBuf out) {
        Codec.INSTANCE.encode(out, packet);
    }
}
