package com.example.springboot_board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.springboot_board.common.interceptor.ViewNameInterceptor;

@Configuration
public class InterceptorConfig  implements WebMvcConfigurer{
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new ViewNameInterceptor())
		.order(1);
		 
		//.excludePathPatterns("/css/**", "/fonts/**", "/plugin/**", "/scripts/**");
	}
}
