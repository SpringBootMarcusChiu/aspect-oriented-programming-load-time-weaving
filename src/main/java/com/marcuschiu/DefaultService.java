package com.marcuschiu;

import org.springframework.stereotype.Service;

@Service
public class DefaultService {

    public String home() {
        return privateMethod();
    }

    private String privateMethod() {
        return "Jesus Christ";
    }
}
