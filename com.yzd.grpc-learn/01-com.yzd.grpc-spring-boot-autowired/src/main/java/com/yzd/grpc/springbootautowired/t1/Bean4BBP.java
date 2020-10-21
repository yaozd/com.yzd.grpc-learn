package com.yzd.grpc.springbootautowired.t1;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @Author: yaozh
 * @Description:
 */
@Slf4j
@Component
public class Bean4BBP {

    public Bean4BBP() {
        log.info("construct Bean4BBP");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}