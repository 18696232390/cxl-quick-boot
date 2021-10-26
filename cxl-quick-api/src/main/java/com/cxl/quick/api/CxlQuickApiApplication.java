package com.cxl.quick.api;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * 启动类
 * @author cxl
 * @date 2021年10月26日23:59:29
 */
@SpringBootApplication
@EnableScheduling
public class CxlQuickApiApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(CxlQuickApiApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("启动完成");
    }
}
