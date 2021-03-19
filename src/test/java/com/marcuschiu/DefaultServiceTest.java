package com.marcuschiu;

import org.junit.jupiter.api.Test;

public class DefaultServiceTest {

    @Test
    public void test() {
        DefaultService defaultService = new DefaultService();
        System.out.println(defaultService.home());
    }
}
