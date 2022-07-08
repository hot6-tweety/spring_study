package com.example.backend_todolist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/*
 * (Cross-Origin Resource Sharing,CORS) 란 다른 출처의 자원을 공유할 수 있도록 설정하는 권한 체제를 말
 * https://dev-pengun.tistory.com/entry/Spring-Boot-CORS-%EC%84%A4%EC%A0%95%ED%95%98%EA%B8%B0
 * 
 */

@Configuration
public class WebConfig extends WebMvcConfigurationSupport{
	@Override
	protected void addCorsMappings(CorsRegistry registry) {
		registry
		  .addMapping("/**")
		  .allowedOrigins("http://localhost:3000")
		  .allowedMethods("GET", "POST","PUT","DELETE");
	}

}
