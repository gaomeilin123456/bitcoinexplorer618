package com.gml.bitcoinexplorer618;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.gml.bitcoinexplorer618.dao")
@EnableFeignClients
@EnableScheduling
@EnableAsync
public class Bitcoinexplorer618Application {

    public static void main(String[] args) {
        SpringApplication.run(Bitcoinexplorer618Application.class, args);
    }

}
