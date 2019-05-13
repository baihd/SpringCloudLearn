package com.composite.nacosConsumer.controller;

import com.composite.nacosConsumer.config.EchoClient;
import feign.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private EchoClient echoClient;


    @RequestMapping(value = "/echo1/{str}", method = RequestMethod.GET)
    public String echo1(@PathVariable String str) {
        return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
    }

    @RequestMapping(value = "/echo2/{str}", method = RequestMethod.GET)
    public Mono<String> echo2(@PathVariable String str) {
        Mono<String> result = webClientBuilder.build().get()
                .uri("http://service-provider/echo/" + str)
                .retrieve().bodyToMono(String.class);
        return result;
    }

    @RequestMapping(value = "/echo3/{str}", method = RequestMethod.GET)
    public String echo3(@PathVariable String str) {
        String value = echoClient.echo(str);
        return value;
    }


}
