package com.marcuschiu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(MainApplication.class).run(args);
	}

//	@Bean
//	public AspectConfig aspectConfig() {
//		return Aspects.aspectOf(AspectConfig.class);
//	}
}
