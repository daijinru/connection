package com.connection.connection;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
public class ConnectionApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConnectionApplication.class, args);
    }
}
