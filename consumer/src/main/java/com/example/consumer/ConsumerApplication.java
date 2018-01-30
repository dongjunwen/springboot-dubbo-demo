package com.example.consumer;

import com.example.consumer.controller.EchoClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) throws InterruptedException {
		//SpringApplication.run(ConsumerApplication.class, args);
		ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
		EchoClientService bean = run.getBean(EchoClientService.class);
		for(int i=0;i<=10;i++){
			System.out.println(bean.echoService.sayHello("abccc")+i);
			Thread.sleep(1000);
		}

	}
}
