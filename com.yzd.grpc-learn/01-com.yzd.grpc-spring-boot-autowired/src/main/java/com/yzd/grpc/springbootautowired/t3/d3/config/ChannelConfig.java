package com.yzd.grpc.springbootautowired.t3.d3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ChannelConfig与ServiceChannel进行合并
 * @Author: yaozh
 * @Description:
 */
//@Configuration
public class ChannelConfig {
    @Bean(ServiceChannel.CHANNEL1)
    public Channel newChannel1() {
        Channel channel = new Channel();
        channel.setName("01");
        return channel;
    }
    @Bean(ServiceChannel.CHANNEL2)
    public Channel newChannel2() {
        Channel channel = new Channel();
        channel.setName("02");
        return channel;
    }
}
