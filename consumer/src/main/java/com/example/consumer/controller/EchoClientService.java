package com.example.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.api.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoClientService {
    @Reference(version = "1.0.0")
    public EchoService echoService;
}
