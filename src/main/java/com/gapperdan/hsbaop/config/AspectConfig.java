package com.gapperdan.hsbaop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Configuration
public class AspectConfig {
	
	@Before("execution(* com.gapperdan.hsbaop..*.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("here at "+joinPoint.getSignature().getName()+"()");
	}	
}