package com.allen.uniapp.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author allen
 */
@SpringBootApplication
public class ChatApplication {

    public static void main(String[] args) {
        new SpringApplication(ChatApplication.class).run(args);
    }

}
