package com.marcuschiu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MainApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainApplicationTest {

    @Autowired
    DefaultController defaultController;

    @Test
    public void test() {
        System.out.println(defaultController.home());
    }
}
