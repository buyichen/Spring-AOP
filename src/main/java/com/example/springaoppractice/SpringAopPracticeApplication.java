package com.example.springaoppractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringAopPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopPracticeApplication.class, args);
    }

}
