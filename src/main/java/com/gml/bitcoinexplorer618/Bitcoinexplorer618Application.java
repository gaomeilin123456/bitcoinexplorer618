package com.gml.bitcoinexplorer618;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gml.bitcoinexplorer618.dao")
public class Bitcoinexplorer618Application {

    public static void main(String[] args) {
        SpringApplication.run(Bitcoinexplorer618Application.class, args);
    }

}
