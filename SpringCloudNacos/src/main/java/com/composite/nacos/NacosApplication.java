package com.composite.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NacosApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosApplication.class, args);
	}


	@RestController
	@RefreshScope
	static class TestController {

		@Value("${didispace.title:}")
		private String title;

		@GetMapping("/test")
		public String hello() {
			return title;
		}

	}
}
