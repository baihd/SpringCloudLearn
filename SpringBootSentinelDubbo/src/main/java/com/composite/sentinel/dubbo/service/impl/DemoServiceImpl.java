package com.composite.sentinel.dubbo.service.impl;

import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.composite.dubbo.interfaces.service.DemoService;
import org.springframework.stereotype.Component;


@com.alibaba.dubbo.config.annotation.Service
@Component
public class DemoServiceImpl implements DemoService {

    @SentinelResource(value = "hello",
            //流量类型，IN和OUT
            //IN：指进入系统的入口流量，比如http请求或者是其他的rpc之类的请求。为了统计整个系统的流量水平，用以自我保护的一种方式。
            //OUT：是指系统调用其他第三方服务的出口流量。一方面是为了保护第三方系统，另一方面也可以保护自己的系统。
            //入口、出口流量只有在配置了系统规则时才有效。
            entryType = EntryType.IN,
            //处理BlockException
            blockHandler = "blockHandlerException",
            //仅针对降级功能生效
            fallback = "fallbackException")
    @Override
    public String hello(String name) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return "hello" + name;
    }

    public String blockHandlerException(String name, BlockException e) {
        return "blockHandler:" + name;
    }

    public String fallbackException(String name) {
        return "fallback:" + name;
    }

}
