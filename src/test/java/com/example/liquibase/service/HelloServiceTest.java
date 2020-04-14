package com.example.liquibase.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class HelloServiceTest {
    @Autowired
    private HelloService helloService;

    @Test
    void hello() {
        String hello = helloService.hello();
        String expectedMsg = "Hello world!";

        assertEquals(expectedMsg, hello);
    }
}