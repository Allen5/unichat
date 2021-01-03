package com.allen.uniapp.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author allen
 */
@SpringBootApplication
@MapperScan(basePackages = {
        "com.allen.uniapp.server.mapper"
})
public class ChatApplication {

    public static void main(String[] args) {
        new SpringApplication(ChatApplication.class).run(args);
    }

}
