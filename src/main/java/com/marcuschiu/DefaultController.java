package com.marcuschiu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @RequestMapping("/")
    public String home() {
        return privateMethod();
    }

    private String privateMethod() {
        return "Jesus Christ";
    }
}
