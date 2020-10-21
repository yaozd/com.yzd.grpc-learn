package com.yzd.grpc.springbootautowired.t3.d2;

/**
 * @Author: yaozh
 * @Description:
 */
public class BlockingStub {
    public BlockingStub(){

    }
    public BlockingStub(Channel channel){
        System.out.println("Init blocking stub with param channel!");
    }

    public void save() {
        System.out.println("Call save!");
    }
}
