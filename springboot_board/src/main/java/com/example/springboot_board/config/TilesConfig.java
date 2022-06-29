package com.example.springboot_board.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfig {
	@Bean
	 public TilesConfigurer tilesConfigurer() {
		 final TilesConfigurer configurer = new TilesConfigurer();
		 String[] defs = {"classpath*:/tiles/*.xml" };
		 configurer.setDefinitions(defs);
		 configurer.setCheckRefresh(true);
		 return configurer;
	 }

	 @Bean
	 public TilesViewResolver tilesViewResolver() {
		 final TilesViewResolver tilesViewResolver = new TilesViewResolver();
		 tilesViewResolver.setViewClass(TilesView.class);
		 tilesViewResolver.setOrder(1);
		 return tilesViewResolver;
	 }
}
