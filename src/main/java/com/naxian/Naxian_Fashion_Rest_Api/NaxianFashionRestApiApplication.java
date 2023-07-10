package com.naxian.Naxian_Fashion_Rest_Api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class NaxianFashionRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaxianFashionRestApiApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer crossConfig(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("*")
						.allowedOrigins("*");
			}
		};
	}

}
