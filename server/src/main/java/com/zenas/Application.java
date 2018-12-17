package com.zenas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }

}
