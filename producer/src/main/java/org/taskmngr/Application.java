package org.taskmngr;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Application {
    public static void main(String[] args) {
        log.info("higit ");
        SpringApplication.run(Application.class,args);
        System.out.println("Hello world from Prod!");
    }
}