package com.gapperdan.hsbaop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gapperdan.hsbaop.service.RandomGeneratorService;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public RandomGeneratorService randomGeneratorService() {
		return new RandomGeneratorService();
	}
}
