package com.yzd.grpc.springbootautowired.t3.d3;

import com.yzd.grpc.springbootautowired.t3.d3.config.ServiceChannel;
import org.springframework.stereotype.Component;

/**
 * @Author: yaozh
 * @Description:
 */
@Component
public class BlockingStubTest {

    //@Autowired
    //@StubInjected(channel = ServiceChannel.CHANNEL1)
    @StubInjected(channel = ServiceChannel.CHANNEL2)
    BlockingStub blockingStub;

    public void save() {
        blockingStub.save();
    }
}
