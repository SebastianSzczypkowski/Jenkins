package com.example.testrepo111;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TestRepo111Application {

    public static void main(String[] args) {
        SpringApplication.run(TestRepo111Application.class, args);
    }

    @GetMapping
    public String get()
    {
        return "hello Jenkins";
    }


}
