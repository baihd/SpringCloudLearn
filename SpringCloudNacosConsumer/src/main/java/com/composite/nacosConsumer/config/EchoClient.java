package com.composite.nacosConsumer.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient("service-provider")
public interface EchoClient {
    @GetMapping("/echo/{str}")
    String echo(@RequestParam(name = "str") String str);
}
