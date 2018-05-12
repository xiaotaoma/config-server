package com.zkzn.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * application.properties加载顺序
    jar包同一目录下config文件夹下application.properties
    jar包同一目录下application.properties
    java -jar *.jar -Dspring.config.location=application.properties
    classpath下config文件夹中application.properties
    classpath下application.properties
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
