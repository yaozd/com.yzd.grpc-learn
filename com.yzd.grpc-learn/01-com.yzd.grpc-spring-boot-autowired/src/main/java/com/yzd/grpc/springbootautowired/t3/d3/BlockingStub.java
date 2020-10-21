package com.yzd.grpc.springbootautowired.t3.d3;

import com.yzd.grpc.springbootautowired.t3.d3.config.Channel;

/**
 * @Author: yaozh
 * @Description:
 */
public class BlockingStub {
    private Channel channel;
    private String name;

    private BlockingStub() {
        System.out.println("Init blocking stub with param channel!");
    }

    public BlockingStub(Channel channel) {
        this.channel = channel;
    }

    public static BlockingStub newBlockingStub() {
        return new BlockingStub();
    }

    public static BlockingStub newBlockingStub(Channel channel) {
        return new BlockingStub(channel);
    }

    public void save() {
        System.out.println("Call save!name=" + name);
        String cName=channel==null?null:channel.getName();
        System.out.println("Channel name=" + cName);
    }

    public void setName(String name) {
        this.name = name;
    }
}
