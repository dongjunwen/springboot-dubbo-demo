package com.example.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.api.EchoService;

@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Override
    public String sayHello(String words) {
        return words+"4444444444";
    }
}
