package com.marcuschiu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(MainApplication.class).run(args);
	}

	@Autowired
	DefaultService defaultService;

	@PostConstruct
	public void post() {
		System.out.println(defaultService.home());
	}

//	@Bean
//	public AspectConfig aspectConfig() {
//		return Aspects.aspectOf(AspectConfig.class);
//	}
}
