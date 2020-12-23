package com.spring;


import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * SpringBoot 启动入口
 *
 * @author bigdata@tcfuture.tech
 * @since 1.0.2
 */
@EnableScheduling
@SpringBootApplication
@EnableJpaAuditing
public class App{

    public static void main(String[] args) {
        // 启动SpringBoot
        SpringApplication.run(App.class, args);
    }

}

