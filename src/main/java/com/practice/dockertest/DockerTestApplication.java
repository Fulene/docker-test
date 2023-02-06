package com.practice.dockertest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerTestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DockerTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("It's working !");
    }

}
